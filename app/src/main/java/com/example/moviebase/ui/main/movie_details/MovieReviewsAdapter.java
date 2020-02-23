package com.example.moviebase.ui.main.movie_details;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.moviebase.R;
import com.example.moviebase.databinding.ItemMovieReviewBinding;
import com.example.moviebase.data.model.MovieReview;
import com.example.moviebase.ui.base.BaseRecyclerViewAdapter;
import com.example.moviebase.ui.base.BaseViewHolder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

public class MovieReviewsAdapter extends BaseRecyclerViewAdapter<MovieReview> {


    public MovieReviewsAdapter(List< MovieReview > items) {
        super(items);
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemMovieReviewBinding itemMovieReviewBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.item_movie_review,parent ,false
        );
        return new MovieReviewVHolder(itemMovieReviewBinding);
    }

    class MovieReviewVHolder extends BaseViewHolder {

        //TODO :: Data Binding set adapter w bet3mlo b3d;
        ItemMovieReviewBinding itemMovieReviewBinding;

        public MovieReviewVHolder(ItemMovieReviewBinding itemMovieReviewBinding) {
            super(itemMovieReviewBinding.getRoot());
            this.itemMovieReviewBinding = itemMovieReviewBinding;
        }

        @Override
        public void onBind(int position) {
            itemMovieReviewBinding.setMovieReview(getItems().get(position));
        }
    }
}
