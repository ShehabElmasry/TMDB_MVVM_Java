package com.example.moviebase.dagger.builders;

import com.example.moviebase.dagger.modules.movie.MoviesViewModelModule;
import com.example.moviebase.views.MoviesFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsBuilderModule {

    @ContributesAndroidInjector (modules = MoviesViewModelModule.class)
    abstract MoviesFragment contributeMoviesFragment();

}
