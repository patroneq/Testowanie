package com.testowanie.service.Implementation;

import com.testowanie.model.Episode;
import com.testowanie.repository.EpisodeRepository;
import com.testowanie.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("episodeService")
public class EpisodeServiceImpl implements EpisodeService {

    @Autowired
    private EpisodeRepository episodeRepository;

    @Override
    public Episode findEpisodeById(Long id) {
        return episodeRepository.findById(id);
    }

    @Override
    public Episode findEpisodeByTitle(String title) { return episodeRepository.findByTitle(title); }

    @Override
    public void saveEpisode(Episode episode) {
        episodeRepository.save(episode);
    }

    @Override
    public List<Episode> findAll() {
        return episodeRepository.findAll();
    }
}