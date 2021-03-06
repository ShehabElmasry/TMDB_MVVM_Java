package com.example.moviebase.data.remote.client;

import com.example.moviebase.data.model.MovieDetails;
import com.example.moviebase.data.model.api.DataResponse;
import com.example.moviebase.data.model.api.MovieReviewResponse;
import com.example.moviebase.data.model.api.MovieVideosResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/3/movie/{category}")
    Single<DataResponse> getMovies(
            @Path("category") String category,
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("/3/movie/{movie_id}")
    Single<MovieDetails> getMovieDetails(
            @Path("movie_id") int id,
            @Query("api_key") String apiKey,
            @Query("language") String language
    );

    @GET("/3/movie/{movie_id}/videos")
    Single<MovieVideosResponse> getMovieTrailers(
            @Path("movie_id") int id,
            @Query("api_key") String apiKey,
            @Query("language") String language
    );

    @GET("/3/movie/{movie_id}/reviews")
    Single<MovieReviewResponse> getMovieReviews(
            @Path("movie_id") int id,
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("/3/movie/{movie_id}/similar")
    Single<DataResponse> getSimilarMovies(
            @Path("movie_id") int id,
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );



}
