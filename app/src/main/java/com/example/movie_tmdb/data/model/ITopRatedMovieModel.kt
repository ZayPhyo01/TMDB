package com.example.movie_tmdb.data.model

import com.example.movie_tmdb.data.vos.TopRatedMoviesVO

interface ITopRatedMovieModel {


    fun getTopRatedMovies(): TopRatedMoviesVO


}