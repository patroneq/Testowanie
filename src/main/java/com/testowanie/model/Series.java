package com.testowanie.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "series")
public class Series {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "series_id")
	private Long id;

	@Column(name = "title")
	private String title;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "series")
	private List<Season> seasons;

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

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
}