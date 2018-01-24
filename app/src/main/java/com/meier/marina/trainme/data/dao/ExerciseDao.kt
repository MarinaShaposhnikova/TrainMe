package com.meier.marina.trainme.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.meier.marina.trainme.data.model.Exercise
import io.reactivex.Flowable

@Dao
interface ExerciseDao {

    @Query("SELECT * FROM exercise")
    fun getExercises(): Flowable<List<Exercise>>

    @Insert
    fun addExercise(exercise: Exercise)

    @Delete
    fun deleteExercise(exercise: Exercise)
}
