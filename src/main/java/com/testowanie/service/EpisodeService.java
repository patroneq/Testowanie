package com.testowanie.service;

import com.testowanie.model.Episode;
import java.util.List;

public interface EpisodeService {
    public Episode findEpisodeById(Long id);
    public Episode findEpisodeByTitle(String title);
    public void saveEpisode(Episode episode);
    public List<Episode> findAll();
}
