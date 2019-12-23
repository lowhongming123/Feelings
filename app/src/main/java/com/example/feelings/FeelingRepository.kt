package com.example.feelings

import androidx.lifecycle.LiveData

class FeelingRepository (private val feelingDao: FeelingDao){

    val allFeelings:LiveData<List<Feeling>>=FeelingDao.get()

            suspend fun insert(feeling: Feeling){
                FeelingDao.insert(feeling)
            }
}