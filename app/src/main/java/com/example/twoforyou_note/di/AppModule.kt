package com.example.twoforyou_note.di

import android.content.Context
import androidx.room.Room
import com.example.twoforyou_note.database.NoteDao
import com.example.twoforyou_note.database.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun providesNoteDao(noteDatabase : NoteDatabase) : NoteDao {
        return noteDatabase.noteDao()
    }

    @Singleton
    @Provides
    fun providesAppDatabase(@ApplicationContext context : Context) : NoteDatabase {
        return Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            "note_database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

}