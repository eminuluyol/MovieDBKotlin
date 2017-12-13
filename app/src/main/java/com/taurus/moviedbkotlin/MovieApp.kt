package com.taurus.moviedbkotlin

import com.taurus.core.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class MovieApp : DaggerApplication() {

  override fun applicationInjector(): AndroidInjector<out MovieApp> =
      DaggerAppComponent.builder().create(this)

}