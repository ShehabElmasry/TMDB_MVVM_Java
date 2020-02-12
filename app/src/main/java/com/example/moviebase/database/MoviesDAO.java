package com.example.moviebase.database;

import com.example.moviebase.models.Movie;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MoviesDAO {
    @Insert
    void insert(Movie movie);

    @Query("select * from FavoriteMovies")
    LiveData<List<Movie>> loadAll();

    @Query("delete from FavoriteMovies where id = :movieID")
    void delete(long movieID);
}
