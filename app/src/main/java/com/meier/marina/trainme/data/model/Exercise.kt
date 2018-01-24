package com.meier.marina.trainme.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(
        entity = Day::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("dayId"),
        onDelete = ForeignKey.CASCADE)))
data class Exercise(
        var name: String = "",
        var description: String = "",
        var dayId: Long = 0L) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L
}
