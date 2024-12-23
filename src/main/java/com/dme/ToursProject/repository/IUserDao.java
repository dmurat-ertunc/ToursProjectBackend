package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserDao extends JpaRepository<User,Long> {
    Optional<User> findByUserName(String userName);

}
