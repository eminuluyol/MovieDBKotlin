package com.taurus.core.di.module

import android.arch.lifecycle.ViewModelProvider
import com.taurus.core.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
internal abstract class ViewModelModule {

  @Binds
  abstract fun provideViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}