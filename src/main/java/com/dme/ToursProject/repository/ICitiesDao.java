package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICitiesDao extends JpaRepository<Cities,Long> {
}
