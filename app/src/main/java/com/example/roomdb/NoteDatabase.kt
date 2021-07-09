package com.example.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.roomdb.Dao.NoteDao
//import com.example.roomdb.subscribeOnBackground

@Database(entities = [Notes::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
    companion object{
        private var Instance:NoteDatabase?=null

        fun getDatabase(context: Context):NoteDatabase? {
            if (Instance == null) {
                synchronized(NoteDatabase::class.java) {
                    if (Instance == null) {
                        Instance = Room.databaseBuilder(context.applicationContext, NoteDatabase::class.java, "Note").allowMainThreadQueries()
                            .fallbackToDestructiveMigration().build()
                    }
                }

            }
            return Instance
        }


    }


}




