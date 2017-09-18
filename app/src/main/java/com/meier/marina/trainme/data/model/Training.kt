package com.meier.marina.trainme.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Training(
        @PrimaryKey(autoGenerate = true)
        val uid: Long,
        val days: List<Day>
)
