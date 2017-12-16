package com.taurus.splash

import android.os.Bundle
import dagger.android.DaggerActivity

class SplashActivity : DaggerActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)

  }
}
