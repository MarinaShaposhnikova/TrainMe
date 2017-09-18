package com.meier.marina.trainme.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Exercise(
        @PrimaryKey(autoGenerate = true)
        val uid: Long,
        val name: String = "",
        val description: String = ""
)
