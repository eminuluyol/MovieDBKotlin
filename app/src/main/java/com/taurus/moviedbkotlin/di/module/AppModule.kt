package com.taurus.core.di.module

import android.content.Context
import com.taurus.core.MovieApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = arrayOf(ViewModelModule::class))
class AppModule {

  @Provides
  @Singleton
  fun provideContext(movieApp: MovieApp): Context = movieApp.applicationContext

}