package com.testowanie.service.Implementation;

import com.testowanie.model.EpisodeReview;
import com.testowanie.repository.EpisodeReviewRepository;
import com.testowanie.service.EpisodeReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("episodeReviewService")
public class EpisodeReviewServiceImpl implements EpisodeReviewService {

	@Autowired
	private EpisodeReviewRepository episodeReviewRepository;

	@Override
	public EpisodeReview findEpisodeReviewById(Long id) {
		return episodeReviewRepository.findById(id);
	}

	@Override
	public void saveEpisodeReview(EpisodeReview episodeReview) {
		episodeReviewRepository.save(episodeReview);
	}

	@Override
	public List<EpisodeReview> findAll() {
		return episodeReviewRepository.findAll();
	}
}