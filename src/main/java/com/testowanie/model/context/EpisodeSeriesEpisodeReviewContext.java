package com.testowanie.model.context;

import com.testowanie.model.Episode;
import com.testowanie.model.EpisodeReview;
import com.testowanie.model.Series;

public class EpisodeSeriesEpisodeReviewContext {
    private EpisodeReview episodeReview;
    private Episode episode;

    private Series series;

    public EpisodeReview getEpisodeReview() {
        return episodeReview;
    }

    public void setEpisodeReview(EpisodeReview episodeReview) {
        this.episodeReview = episodeReview;
    }

    public Episode getEpisode() {
        return episode;
    }

    public void setEpisode(Episode episode) {
        this.episode = episode;
    }


    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }
}