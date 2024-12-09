package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.PlannedTours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlannedToursDao extends JpaRepository<PlannedTours,Long> {
}
