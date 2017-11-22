package com.testowanie.service;

import com.testowanie.model.Series;
import java.util.List;

public interface SeriesService {
	public Series findSeriesById(Long id);
	public void saveSeries(Series series);
	public List<Series> findAll();
}
