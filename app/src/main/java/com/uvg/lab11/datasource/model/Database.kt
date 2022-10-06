package com.uvg.lab11.datasource.model

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase

@Database(entities = [Character::class], version = 1)
abstract class Database() :RoomDatabase(){
    abstract fun characterDao(): CharacterDao

}