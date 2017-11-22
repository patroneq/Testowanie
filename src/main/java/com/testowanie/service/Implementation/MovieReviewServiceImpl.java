package com.testowanie.service.Implementation;

import com.testowanie.model.MovieReview;
import com.testowanie.repository.MovieReviewRepository;
import com.testowanie.service.MovieReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("movieReviewService")
public class MovieReviewServiceImpl implements MovieReviewService {

	@Autowired
	private MovieReviewRepository movieReviewRepository;

	@Override
	public MovieReview findMovieReviewById(Long id) {
		return movieReviewRepository.findById(id);
	}

	@Override
	public void saveMovieReview(MovieReview movieReview) {
		movieReviewRepository.save(movieReview);
	}

	@Override
	public List<MovieReview> findAll() {
		return movieReviewRepository.findAll();
	}
}