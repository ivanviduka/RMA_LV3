package com.example.inspiringpersonsdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "persons")
data class Person (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "birthday") val birthday: String,
    @ColumnInfo(name = "photo") val photo: String,
    @ColumnInfo(name = "info") val info: String,
    @ColumnInfo(name = "quote") val quote: String){
}