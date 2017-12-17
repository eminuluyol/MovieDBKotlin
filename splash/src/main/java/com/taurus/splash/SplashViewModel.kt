package com.taurus.splash

import com.taurus.repository.local.PopularMovieEntity


interface SplashViewModel {

  fun setListener(listener: Listener?)

  interface Listener {
    fun onGenreResponse(popularMovies: List<PopularMovieEntity>)

    companion object {
      fun noOpListener() = NO_OP
    }
  }

  private class ResponseListener : Listener {

    override fun onGenreResponse(popularMovies: List<PopularMovieEntity>) {
      TODO()
    }
  }

}

private val NO_OP: SplashViewModel.Listener = object : SplashViewModel.Listener {
  override fun onGenreResponse(popularMovies: List<PopularMovieEntity>) {
    //no-op
  }

}