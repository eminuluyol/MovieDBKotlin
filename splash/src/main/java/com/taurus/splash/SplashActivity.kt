package com.taurus.splash

import android.os.Bundle
import base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.splashView
import kotlinx.android.synthetic.main.splash_screen.*


class SplashActivity : BaseActivity<SplashViewArchModel>() {

  private lateinit var splashPresenter : SplashPresenter

  override fun getViewModel(): Class<SplashViewArchModel> {
    return SplashViewArchModel::class.java
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)

    splashPresenter.bind(splashView , viewModel)

  }
}
