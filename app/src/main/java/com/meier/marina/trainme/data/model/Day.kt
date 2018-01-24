package com.meier.marina.trainme.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey

@Entity(indices = arrayOf(Index(value = "trainingId")),
        foreignKeys = arrayOf(ForeignKey(
                entity = Training::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("trainingId"),
                onDelete = ForeignKey.CASCADE)))
data class Day(
        var trainingId: Long,
        var name: String = "") {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L
}
