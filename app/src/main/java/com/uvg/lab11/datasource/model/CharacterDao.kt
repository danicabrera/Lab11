package com.uvg.lab11.datasource.model

import androidx.room.*

@Dao
interface CharacterDao {
    @Query("SELECT * FROM Character LIMIT 20")
    fun getAllCharacters(): List<Character>

    @Query("SELECT * FROM Character WHERE id= :id")
    fun  getCharacter(id:Int): Character

    @Query("SELECT name FROM Character WHERE id= :id")
    fun  getCharacterName(id:Int): String

    @Update
    fun updateCharacter(character: Character)

    @Query("UPDATE character SET name= :name WHERE id= :id")
    fun updateNameCharacter(id: Int, name: String)

    @Insert
    fun insertCharacter(character: Character)

    @Delete
    fun deleteCharacter(character: Character): Int
}