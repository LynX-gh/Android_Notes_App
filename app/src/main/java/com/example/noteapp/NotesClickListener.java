package com.example.noteapp;

import androidx.cardview.widget.CardView;

import com.example.noteapp.Models.Notes;

public interface NotesClickListener {
    void onLongClick(Notes notes, CardView cardView);
    void onCLick(Notes notes);
}
