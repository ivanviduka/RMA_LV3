package com.example.inspiringpersonsdb


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonDao {
    @Insert
    fun insert(person: Person)

    @Delete
    fun delete(person: Person)

    @Query("SELECT * FROM persons")
    fun getAll(): MutableList<Person>

    @Query("SELECT * FROM persons WHERE id = :id")
    fun getById(id: Int): Person
}