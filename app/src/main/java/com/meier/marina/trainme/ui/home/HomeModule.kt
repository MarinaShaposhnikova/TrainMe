package com.meier.marina.trainme.ui.home

import android.arch.lifecycle.ViewModel
import com.meier.marina.trainme.di.PerActivity
import com.meier.marina.trainme.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeModule {

    @Binds
    @IntoMap
    @PerActivity
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindsHomeViewModel(homeViewModel: HomeViewModel): ViewModel

}
