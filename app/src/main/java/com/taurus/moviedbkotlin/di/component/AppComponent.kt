package com.taurus.core.di.component

import com.taurus.core.di.module.ActivityBuilderModule
import com.taurus.core.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilderModule::class))
interface AppComponent : AndroidInjector<MovieApp> {
  @Component.Builder
  abstract class Builder : AndroidInjector.Builder<MovieApp>()
}