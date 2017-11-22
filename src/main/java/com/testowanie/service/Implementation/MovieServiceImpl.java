package com.testowanie.service.Implementation;

import com.testowanie.model.Movie;
import com.testowanie.repository.MovieRepository;
import com.testowanie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public Movie findMovieById(Long id) {
		return movieRepository.findById(id);
	}

	@Override
	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
	}

	@Override
	public List<Movie> findAll() {
		return movieRepository.findAll();
	}
}