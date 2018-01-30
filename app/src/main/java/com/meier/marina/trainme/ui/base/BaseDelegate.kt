package com.meier.marina.trainme.ui.base

import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.annotation.Nullable
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.hannesdorfmann.adapterdelegates3.AdapterDelegate
import android.databinding.OnRebindCallback


class BaseDelegate<T : ViewDataBinding> constructor(
        val items: List<Identifiable>?,
        val id: Int,
        val recyclerView: RecyclerView,
        @LayoutRes val layout: Int)
    : AdapterDelegate<List<Identifiable>>() {

    private val DB_PAYLOAD = Any()
    @Nullable private var holderBindingListener: HolderBinding? = null

    private val onRebindCallback = object : OnRebindCallback<T>() {
        override fun onPreBind(binding: T): Boolean {
            if (recyclerView.isComputingLayout()) {
                return true
            }
            val childAdapterPosition = recyclerView.getChildAdapterPosition(binding.root)
            if (childAdapterPosition == RecyclerView.NO_POSITION) {
                return true
            }
            recyclerView.adapter.notifyItemChanged(childAdapterPosition, DB_PAYLOAD)
            return false
        }
    }

    override fun isForViewType(items: List<Identifiable>, position: Int): Boolean {
        return true //To return a realy value - create it
    }

    override fun onBindViewHolder(items: List<Identifiable>, position: Int, holder: RecyclerView.ViewHolder, payloads: MutableList<Any>) {
        if (holder is DataBoundViewHolder<*>) {

            if (payloads.isEmpty() || hasNonDataBindingInvalidate(payloads)) {
                bind(holder, position)
            }
            holder.binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?): RecyclerView.ViewHolder {
        val vh = DataBoundViewHolder.create<T>(parent, layout)
        vh.binding.addOnRebindCallback(onRebindCallback);
        return vh
    }

    fun setListener(holderBinding: HolderBinding) {
        this.holderBindingListener = holderBinding
    }

    private fun hasNonDataBindingInvalidate(payloads: List<Any>): Boolean {
        return payloads.any { it !== DB_PAYLOAD }
    }

    private fun bind(vh: DataBoundViewHolder<ViewDataBinding>, position: Int) {
        vh.binding.setVariable(id, items?.get(position))
        if (holderBindingListener != null) holderBindingListener.customize(vh)
    }

    interface HolderBinding {
        fun customize(vh: DataBoundViewHolder<ViewDataBinding>)
    }
}
