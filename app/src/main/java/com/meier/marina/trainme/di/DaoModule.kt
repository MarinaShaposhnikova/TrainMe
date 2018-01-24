package com.meier.marina.trainme.di

import android.arch.persistence.room.Room
import android.content.Context
import com.meier.marina.trainme.data.db.Database
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DaoModule {

    @Provides
    @Singleton
    fun providesAppDatabase(context: Context): Database {
        return Room.databaseBuilder(
                context, Database::class.java, "database")
                .fallbackToDestructiveMigration()
                .build()

    }
}
