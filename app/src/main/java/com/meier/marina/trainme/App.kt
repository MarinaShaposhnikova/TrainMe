package com.meier.marina.trainme

import com.meier.marina.trainme.di.AppComponent
import com.meier.marina.trainme.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    companion object {
        lateinit var app: App
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .application(this)
                .build().apply { appComponent = this }
    }
}
