package com.taurus.splash

import com.taurus.splash.SplashViewModel.Listener
import utils.RxAwareViewModel


class SplashViewArchModel : RxAwareViewModel(), SplashViewModel {

  private var listener: SplashViewModel.Listener? = null

  override fun setListener(listener: Listener?) {
    this.listener = listener
  }

}