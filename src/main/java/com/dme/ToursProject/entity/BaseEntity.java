package com.dme.ToursProject.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@MappedSuperclass
public class BaseEntity {
    LocalDate date = LocalDate.now();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean isDeleted = false;
    private LocalDate addDate = date;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public boolean isDeleted() {
        return isDeleted;
    }
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
    public LocalDate getAddDate() {
        return addDate;
    }
    public void setAddDate(LocalDate addDate) {
        this.addDate = addDate;
    }
}
