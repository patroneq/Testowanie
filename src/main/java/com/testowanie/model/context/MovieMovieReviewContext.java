package com.testowanie.model.context;

import com.testowanie.model.Movie;
import com.testowanie.model.MovieReview;

public class MovieMovieReviewContext {
    private MovieReview movieReview;
    private Movie movie;

    public MovieReview getMovieReview() {
        return movieReview;
    }

    public void setMovieReview(MovieReview movieReview) {
        this.movieReview = movieReview;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
