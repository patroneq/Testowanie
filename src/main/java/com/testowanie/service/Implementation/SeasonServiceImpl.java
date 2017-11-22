package com.testowanie.service.Implementation;

import com.testowanie.model.Season;
import com.testowanie.repository.SeasonRepository;
import com.testowanie.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("seasonService")
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	private SeasonRepository seasonRepository;

	@Override
	public Season findSeasonById(Long id) {
		return seasonRepository.findById(id);
	}

	@Override
	public void saveSeason(Season season) {
		seasonRepository.save(season);
	}

	@Override
	public List<Season> findAll() {
		return seasonRepository.findAll();
	}
}