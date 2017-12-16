package com.taurus.repository.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Flowable

@Dao
abstract class MovieDBDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  abstract fun insertMovies(list: List<MovieEntity>)

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  abstract fun insertMovies(list: MovieEntity)

  @Query("SELECT * FROM movies")
  abstract fun getMovies(): Flowable<List<MovieEntity>>

}