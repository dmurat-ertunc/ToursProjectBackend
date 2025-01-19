package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.PlannedTours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPlannedToursDao extends JpaRepository<PlannedTours,Long> {
    @Query("SELECT p FROM PlannedTours p WHERE p.tours.id = :id")
    List<PlannedTours> getByToursId(@Param("id") long id);
}
