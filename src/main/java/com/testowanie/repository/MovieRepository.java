package com.testowanie.repository;

import com.testowanie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("movieRepository")
public interface MovieRepository extends JpaRepository<Movie, Long> {
	 List<Movie> findAll();
	 Movie findById(Long id);
	 Movie findByTitle(String title);
}
