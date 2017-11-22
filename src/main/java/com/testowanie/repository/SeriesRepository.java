package com.testowanie.repository;

import com.testowanie.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("seriesRepository")
public interface SeriesRepository extends JpaRepository<Series, Long> {
	 List<Series> findAll();
	 Series findById(Long id);
}
