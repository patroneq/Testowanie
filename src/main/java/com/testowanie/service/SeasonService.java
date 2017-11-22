package com.testowanie.service;

import com.testowanie.model.Season;
import java.util.List;

public interface SeasonService {
	public Season findSeasonById(Long id);
	public void saveSeason(Season season);
	public List<Season> findAll();
}
