package com.testowanie.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "episode")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "episode_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "episode_no")
    private Integer episodeNo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "episode")
    private List<EpisodeReview> episodeReviews;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "season_id")
    private Season season;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEpisodeNo() {
        return episodeNo;
    }

    public void setEpisodeNo(Integer episodeNo) {
        this.episodeNo = episodeNo;
    }

    public List<EpisodeReview> getEpisodeReviews() {
        return episodeReviews;
    }

    public void setEpisodeReviews(List<EpisodeReview> episodeReviews) {
        this.episodeReviews = episodeReviews;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
