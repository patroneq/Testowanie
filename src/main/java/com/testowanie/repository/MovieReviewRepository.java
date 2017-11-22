package com.testowanie.repository;

import com.testowanie.model.MovieReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("movieReviewRepository")
public interface MovieReviewRepository extends JpaRepository<MovieReview, Long> {
	List<MovieReview> findAll();
	MovieReview findById(Long id);
}
