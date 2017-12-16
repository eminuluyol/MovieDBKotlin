package com.taurus.repository

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.taurus.repository.local.PopularMovieDBDao
import com.taurus.repository.local.PopularMovieEntity

@Database(
    entities = [(PopularMovieEntity::class)],
    version = 1)
abstract class MovieDBDatabase : RoomDatabase() {
  abstract fun getPopularMovieDBDao(): PopularMovieDBDao
}