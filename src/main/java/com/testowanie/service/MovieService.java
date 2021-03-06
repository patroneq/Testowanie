package com.testowanie.service;

import com.testowanie.model.Movie;

import java.util.List;

public interface MovieService {
	public Movie findMovieById(Long id);
	public Movie findMovieByTitle(String title);
	public void saveMovie(Movie movie);
	public List<Movie> findAll();
}
