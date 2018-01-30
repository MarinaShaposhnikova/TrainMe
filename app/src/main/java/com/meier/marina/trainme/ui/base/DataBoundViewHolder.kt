package com.meier.marina.trainme.ui.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


open class DataBoundViewHolder<T : ViewDataBinding> constructor(
        binding: T)
    : RecyclerView.ViewHolder(binding.root) {

    companion object {
        @JvmStatic
        fun <T : ViewDataBinding> create(parent: ViewGroup?,
                                         @LayoutRes layoutId: Int): DataBoundViewHolder<T> {
            val binding = DataBindingUtil.inflate<T>(LayoutInflater.from(parent?.context),
                    layoutId, parent, false)
            return DataBoundViewHolder(binding)
        }
    }
}
