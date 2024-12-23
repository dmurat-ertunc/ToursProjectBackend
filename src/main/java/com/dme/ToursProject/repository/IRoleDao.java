package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleDao extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);

}
