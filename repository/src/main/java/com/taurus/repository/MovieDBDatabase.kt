package com.taurus.repository

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.taurus.repository.local.MovieDBDao
import com.taurus.repository.local.MovieEntity

@Database(
    entities = arrayOf(MovieEntity::class),
    version = 1)
abstract class MovieDBDatabase : RoomDatabase() {
  abstract fun getMovieDBDao(): MovieDBDao
}