package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.Stations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStationsDao extends JpaRepository<Stations,Long> {
}
