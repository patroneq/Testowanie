package com.testowanie.service.Implementation;

import com.testowanie.model.Series;
import com.testowanie.repository.SeriesRepository;
import com.testowanie.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("seriesService")
public class SeriesServiceImpl implements SeriesService {

	@Autowired
	private SeriesRepository seriesRepository;

	@Override
	public Series findSeriesById(Long id) {
		return seriesRepository.findById(id);
	}

	@Override
	public void saveSeries(Series series) {
		seriesRepository.save(series);
	}

	@Override
	public List<Series> findAll() {
		return seriesRepository.findAll();
	}
}