package com.example.roomdb.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Insert
import com.example.roomdb.Note

@Dao
interface NoteDao {

    @Insert
    fun insert(note: String)

}