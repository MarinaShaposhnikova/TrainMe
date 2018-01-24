package com.meier.marina.trainme.data.repository

import android.content.Context
import com.meier.marina.trainme.data.db.Database
import com.meier.marina.trainme.data.model.Day
import com.meier.marina.trainme.data.model.Exercise
import com.meier.marina.trainme.data.model.Training
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TrainingRepository @Inject constructor(val context: Context, val db: Database) {

    fun addTraining(): Single<Boolean> {
        return Observable.just(true)
                .doOnNext {
                    val training = Training("Mock training")
                    val day = Day(1, "Mock day")
                    val exercise = Exercise("Mock exercise", "Desc", 1)

                    db.trainingDao().addTraining(training)
                    db.dayDao().addDay(day)
                    db.exerciseDao().addExercise(exercise)
                }
                .firstOrError()
                .subscribeOn(Schedulers.io())
    }
}
