package com.testowanie.service;

import com.testowanie.model.EpisodeReview;

import java.util.List;

public interface EpisodeReviewService {
	public EpisodeReview findEpisodeReviewById(Long id);
	public void saveEpisodeReview(EpisodeReview episodeReview);
	public List<EpisodeReview> findAll();
}
