package com.testowanie.repository;

import com.testowanie.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("seasonRepository")
public interface SeasonRepository extends JpaRepository<Season, Long> {
	 List<Season> findAll();
	 Season findById(Long id);
}
