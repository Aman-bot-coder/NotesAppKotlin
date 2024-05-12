package com.example.mynotes.database
import androidx.room.Dao;
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface Dao {
    @Query("Select * from Note")
    fun getAllNotes():List<Note>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note:Note)

    @Delete
    suspend fun delete(note:Note)
    @Update
    suspend fun update(note: Note)
}