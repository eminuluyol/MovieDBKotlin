package com.taurus.splash

import com.taurus.repository.local.PopularMovieEntity


class SplashPresenter {

  private lateinit var viewModel: SplashViewArchModel

  fun bind(splashView: SplashAndroidView, viewModel: SplashViewArchModel) {
    this.viewModel = viewModel
    splashView.setListener(SplashViewLister())
  }

  fun unbind() {
    viewModel.setListener(null)
  }

  private class SplashViewLister : SplashView.Listener {

    override fun onRetryClicked() {
      TODO()
    }
  }

  private class SplashViewMddelListener : SplashViewModel.Listener {
    override fun onGenreResponse(popularMovies: List<PopularMovieEntity>) {
      TODO()
    }
  }

}