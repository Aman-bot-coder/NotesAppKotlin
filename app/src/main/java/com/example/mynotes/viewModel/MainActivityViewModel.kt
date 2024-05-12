package com.example.mynotes.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.mynotes.database.Database
import com.example.mynotes.database.Note

class MainActivityViewModel(var application:Application):AndroidViewModel(application) {
    lateinit var notelist:List<Note>

    init{
        notelist = Database.getDb(application).Dao().getAllNotes()
    }

}