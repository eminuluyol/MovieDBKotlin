package com.taurus.repository.local

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "popular_movies")
data class PopularMovieEntity(

    @PrimaryKey @ColumnInfo(name = "id") val movieId: Int,
    @ColumnInfo(name = "poster_path") val posterPath: String,
    @ColumnInfo(name = "adult") val adult: Boolean,
    @ColumnInfo(name = "overview") val overview: String,
    @ColumnInfo(name = "original_title") val originalTitle: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "vote_count") val voteCount: Int,
    @ColumnInfo(name = "vote_average") val voteAverage: Double,
    @ColumnInfo(name = "backdrop_path") val backdropPath: String,
    @ColumnInfo(name = "original_language") val originalLanguage: String

)