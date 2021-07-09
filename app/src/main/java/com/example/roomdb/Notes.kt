package com.example.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName="DatabaseTable")
 data class Notes (
    @PrimaryKey(autoGenerate = true) val id: Int? = null,



    @ColumnInfo(name = "first_name") val firstName: String?

)