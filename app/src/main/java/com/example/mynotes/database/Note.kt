package com.example.mynotes.database

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
class Note (
    @PrimaryKey(autoGenerate=true)var id:Int?=null,
    var title:String,
    var disp:String

    )