package com.taurus.core.di.module

import com.taurus.core.di.scope.ActivityScope
import com.taurus.moviedbkotlin.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

  @ActivityScope
  @ContributesAndroidInjector(modules = [(FragmentBuilderModule::class)])
  abstract fun mainActivity(): MainActivity

}