package com.meier.marina.trainme.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.meier.marina.trainme.data.dao.DayDao
import com.meier.marina.trainme.data.dao.ExerciseDao
import com.meier.marina.trainme.data.dao.TrainingDao
import com.meier.marina.trainme.data.model.Day
import com.meier.marina.trainme.data.model.Exercise
import com.meier.marina.trainme.data.model.Training

@Database(entities = arrayOf(
        Day::class,
        Exercise::class,
        Training::class),
        version = 1)
abstract class Database : RoomDatabase() {

    abstract fun dayDao(): DayDao

    abstract fun exerciseDao(): ExerciseDao

    abstract fun trainingDao(): TrainingDao
}

