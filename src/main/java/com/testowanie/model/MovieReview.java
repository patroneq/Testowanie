package com.testowanie.model;

import javax.persistence.*;

@Entity
@Table(name = "movie_review")
public class MovieReview extends Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_review_id")
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "mark")
    private Integer mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
