package com.taurus.repository.local

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "popular_movies")
data class PopularMovieEntity(
    @PrimaryKey @ColumnInfo(name = "movie_id") val movieId: Long,
    @ColumnInfo(name = "movie_name") val movieName: String,
    @ColumnInfo(name = "movie_image_url") val imageUrl: String
)