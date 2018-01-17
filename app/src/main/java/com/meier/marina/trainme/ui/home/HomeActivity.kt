package com.meier.marina.trainme.ui.home

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.meier.marina.trainme.R
import com.meier.marina.trainme.databinding.ActivityMainBinding
import com.meier.marina.trainme.ui.base.BaseActivity
import javax.inject.Inject

class HomeActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject lateinit var factory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = ViewModelProviders.of(this, factory).get(HomeViewModel::class.java)
    }
}
