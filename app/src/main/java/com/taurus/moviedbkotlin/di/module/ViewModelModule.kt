package com.taurus.core.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.taurus.core.di.key.ViewModelKey
import com.taurus.moviedbkotlin.di.ViewModelFactory
import com.taurus.splash.SplashViewArchModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {

  @IntoMap
  @Binds
  @ViewModelKey(SplashViewArchModel::class)
  abstract fun provideHomeVieWModel(splashViewArchModel: SplashViewArchModel): ViewModel

  @Binds
  abstract fun provideViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}