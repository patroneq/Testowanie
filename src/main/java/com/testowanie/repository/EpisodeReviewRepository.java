package com.testowanie.repository;

import com.testowanie.model.EpisodeReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("episodeReviewRepository")
public interface EpisodeReviewRepository extends JpaRepository<EpisodeReview, Long> {
	 List<EpisodeReview> findAll();
	EpisodeReview findById(Long id);
}
