package com.taurus.splash


class SplashPresenter {

  private lateinit var viewModel: SplashViewArchModel

  fun bind(splashView: SplashAndroidView, viewModel: SplashViewArchModel) {
    this.viewModel = viewModel
    splashView.setListener(SplashViewLister())
  }

  fun unbind() {
    viewModel
  }

  private class SplashViewLister : SplashView.Listener {

    override fun onRetryClicked() {
      TODO()
    }

  }
}