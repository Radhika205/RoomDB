package com.example.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var noteDatabase: NoteDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val title= findViewById<EditText>(R.id.editTextTextPersonName)
        val description = findViewById<EditText>(R.id.editTextTextPersonName2).toString()
        val priority = findViewById<EditText>(R.id.editTextTextPersonName3).toString()
        noteDatabase= NoteDatabase.getDatabase(this@MainActivity)!!
        val insert = findViewById<Button>(R.id.insert)
        insert.setOnClickListener(){
            noteDatabase.noteDao().insert(title.text.toString())

        }

        val delete = findViewById<Button>(R.id.delete)
        delete.setOnClickListener(){

        }
        val update =findViewById<Button>(R.id.update)
        update.setOnClickListener(){

        }

    }
}