package com.meier.marina.trainme.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Training(var name: String = "") {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L
}

