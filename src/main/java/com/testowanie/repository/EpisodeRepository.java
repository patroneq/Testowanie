package com.testowanie.repository;

import com.testowanie.model.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("episodeRepository")
public interface EpisodeRepository extends JpaRepository<Episode, Long> {
	 List<Episode> findAll();
	 Episode findById(Long id);
}
