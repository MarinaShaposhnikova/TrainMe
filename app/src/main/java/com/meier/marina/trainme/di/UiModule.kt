package com.meier.marina.trainme.di

import android.arch.lifecycle.ViewModelProvider
import com.meier.marina.trainme.ui.base.ViewModelFactory
import com.meier.marina.trainme.ui.home.HomeActivity
import com.meier.marina.trainme.ui.home.HomeModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiModule {

    @Binds
    abstract fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(HomeModule::class))
    abstract fun contributeHomeActivity(): HomeActivity
}
