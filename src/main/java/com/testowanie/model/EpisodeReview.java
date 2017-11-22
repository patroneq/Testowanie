package com.testowanie.model;

import javax.persistence.*;

@Entity
@Table(name = "episode_review")
public class EpisodeReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "episode_review_id")
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "mark")
    private Integer mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "episode_id")
    private Episode episode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Episode getEpisode() {
        return episode;
    }

    public void setEpisode(Episode episode) {
        this.episode = episode;
    }
}
