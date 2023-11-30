package com.example.twoforyou_note.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.twoforyou_note.model.Note

@Database(
    entities = [Note::class],
    version = 2,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}