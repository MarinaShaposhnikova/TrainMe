package com.meier.marina.trainme

import com.meier.marina.trainme.di.AppComponent
import com.meier.marina.trainme.di.DaggerAppComponent
import com.meier.marina.trainme.di.applyAutoInjector

import dagger.android.support.DaggerApplication

class App : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        app = this

        applyAutoInjector()
    }

    override fun applicationInjector() = DaggerAppComponent.builder()
            .application(this)
            .build().apply { appComponent = this }

    companion object {

        lateinit var app: App
        @JvmStatic lateinit var appComponent: AppComponent

    }
}
