package com.taurus.repository.remote

import kotlinx.android.parcel.Parcelize

@Parcelize
data class PopularMovie(
    val movieId: Int,
    val posterPath: String,
    val adult: Boolean,
    val overview: String,
    val originalTitle: String,
    val title: String,
    val voteCount: Int,
    val voteAverage: Double,
    val backdropPath: String,
    val originalLanguage: String
)