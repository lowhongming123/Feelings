package com.example.feelings

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class FeelingViewModel(application: Application)
    :AndroidViewModel(application) {

    //The ViewModel maintains a reference to the repository to
    private val repository:FeelingRepository

    //LiveData gives us updated words when they change
    val allFeelings:LiveData<List<Feeling>>

    init{
        val userDao=FeelingDatabase.getDatabase(application).FeelingDao()
    }

}