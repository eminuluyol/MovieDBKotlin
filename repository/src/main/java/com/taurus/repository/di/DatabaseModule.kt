package com.taurus.repository.di

import android.arch.persistence.room.Room
import android.content.Context
import com.taurus.repository.MovieDBDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

  companion object {
    val DB_NAME = "moviedb.db"
  }

  @Provides
  @Singleton
  fun provideDatabase(context: Context) = Room.databaseBuilder(context, MovieDBDatabase::class.java,
      DB_NAME).build()

  @Provides
  @Singleton
  fun provideGenreDao(db: MovieDBDatabase) = db.getGenreDao()

}