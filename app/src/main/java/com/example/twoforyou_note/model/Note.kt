package com.example.twoforyou_note.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),
    val time: String,
    val title: String,
    val content: String
)