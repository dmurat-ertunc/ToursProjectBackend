package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.Tours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IToursDao extends JpaRepository<Tours,Long> {
}
