package com.taurus.splash

interface SplashView {

  fun setListener(listener: Listener)

  fun showRetry()

  fun hideRetry()

  fun showLoading()

  fun hideLoading()

  fun showErrorMessage()

  fun hideErrorMessage()

  interface Listener {

    fun onRetryClicked()

    companion object {
      fun noOpListener() = NO_OP
    }
  }

}

private val NO_OP: SplashView.Listener = object : SplashView.Listener {

  override fun onRetryClicked() {
    //no-op
  }

}