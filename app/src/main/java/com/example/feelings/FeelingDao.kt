package com.example.feelings

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FeelingDao {
    @Insert
    suspend fun insertFeeling(feeling:Feeling)

    @Query("Select * FROM feeling")
    fun getFeelings_:LiveData<Feeling>
}
