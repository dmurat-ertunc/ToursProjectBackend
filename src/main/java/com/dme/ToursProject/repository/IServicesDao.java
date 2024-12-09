package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServicesDao extends JpaRepository<Services,Long> {
}
