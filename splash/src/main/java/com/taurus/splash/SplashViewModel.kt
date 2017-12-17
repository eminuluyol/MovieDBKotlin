package com.taurus.splash

import com.taurus.repository.local.PopularMovieEntity


interface SplashViewModel {

  fun setListener(listener: Listener?)

  interface Listener {
    fun onPopularMoviesResponse(popularMovies: List<PopularMovieEntity>)
  }
}