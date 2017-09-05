package com.meier.marina.trainme.di

import android.content.Context
import com.meier.marina.trainme.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App): Context = app.applicationContext
}
