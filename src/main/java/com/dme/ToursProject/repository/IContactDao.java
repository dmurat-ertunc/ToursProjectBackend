package com.dme.ToursProject.repository;

import com.dme.ToursProject.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactDao extends JpaRepository<Contact,Long> {
}
