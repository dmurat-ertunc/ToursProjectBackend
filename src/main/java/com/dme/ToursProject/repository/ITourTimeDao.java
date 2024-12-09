package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.TourTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITourTimeDao extends JpaRepository<TourTime,Long> {
}
