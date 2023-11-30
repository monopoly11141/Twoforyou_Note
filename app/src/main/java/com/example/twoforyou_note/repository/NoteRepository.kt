package com.example.twoforyou_note.repository

import com.example.twoforyou_note.database.NoteDao
import com.example.twoforyou_note.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val noteDao: NoteDao
) {

    fun getNotes() = noteDao.getNotes()

    suspend fun insertNote(note : Note) = noteDao.insertNote(note)

    suspend fun updateNote(note : Note) = noteDao.updateNote(note)

    suspend fun deleteAllNote() = noteDao.deleteAllNote()

    suspend fun deleteNote(note : Note) = noteDao.deleteNote(note)
}