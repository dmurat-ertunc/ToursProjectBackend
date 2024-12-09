package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentsDao extends JpaRepository<Comments,Long> {
}
