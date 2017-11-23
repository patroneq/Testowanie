package com.testowanie.controller;

import com.testowanie.model.*;
import com.testowanie.model.context.EpisodeSeriesEpisodeReviewContext;
import com.testowanie.service.Implementation.EpisodeReviewServiceImpl;
import com.testowanie.service.Implementation.EpisodeServiceImpl;
import com.testowanie.service.Implementation.SeriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RESTEpisodeReviewController {

    @Autowired
    private EpisodeReviewServiceImpl episodeReviewService;

    @Autowired
    private EpisodeServiceImpl episodeService;

    @Autowired
    private SeriesServiceImpl seriesService;

    @RequestMapping(value = "/episodeReview", method = RequestMethod.POST)
    public @ResponseBody Message addEpisodeReview(@RequestBody EpisodeSeriesEpisodeReviewContext episodeSeriesEpisodeReviewContext) {

        EpisodeReview episodeReview = episodeSeriesEpisodeReviewContext.getEpisodeReview();

        String title = episodeSeriesEpisodeReviewContext.getSeries().getTitle();
        Series series = seriesService.findSeriesByTitle(title);

        Episode episode = episodeService.findEpisodeByTitle(episodeSeriesEpisodeReviewContext.getEpisode().getTitle());
        boolean checkIfExists = false;

        List<Season> seasons = series.getSeasons();
        for (Season season : seasons) {
            if (season.getEpisodes().contains(episode)) {
                checkIfExists = true;
                episodeReview.setEpisode(episode);
                episodeReviewService.saveEpisodeReview(episodeReview);
            }
        }
        if (checkIfExists == true) {
            return new Message(200, "Episode review has been added successfully!");
        } else {
            return new Message(205, "Episode does not exist in this series!");
        }
    }
}