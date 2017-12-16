package com.taurus.repository.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Flowable

@Dao
abstract class PopularMovieDBDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  abstract fun insertMovies(list: List<PopularMovieEntity>)

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  abstract fun insertMovies(list: PopularMovieEntity)

  @Query("SELECT * FROM popular_movies")
  abstract fun getMovies(): Flowable<List<PopularMovieEntity>>

}