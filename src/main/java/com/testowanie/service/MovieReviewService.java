package com.testowanie.service;

import com.testowanie.model.MovieReview;
import java.util.List;

public interface MovieReviewService {
	public MovieReview findMovieReviewById(Long id);
	public void saveMovieReview(MovieReview movieReview);
	public List<MovieReview> findAll();
}
