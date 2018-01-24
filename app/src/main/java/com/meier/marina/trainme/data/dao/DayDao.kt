package com.meier.marina.trainme.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.meier.marina.trainme.data.model.Day
import io.reactivex.Flowable

@Dao
interface DayDao {

    @Query("SELECT * FROM day")
    fun getDays(): Flowable<List<Day>>

    @Insert
    fun addDay(day: Day)

    @Delete
    fun deleteDay(day: Day)
}
