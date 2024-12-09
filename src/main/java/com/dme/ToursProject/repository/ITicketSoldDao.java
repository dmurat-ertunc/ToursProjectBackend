package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.TicketSold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketSoldDao extends JpaRepository<TicketSold,Long> {
}
