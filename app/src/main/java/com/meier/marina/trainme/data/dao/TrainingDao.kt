package com.meier.marina.trainme.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.meier.marina.trainme.data.model.Training
import io.reactivex.Flowable

@Dao
interface TrainingDao {

    @Query("SELECT * FROM training")
    fun getTraining(): Flowable<List<Training>>

    @Insert
    fun addTraining(training: Training)
}
