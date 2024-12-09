package com.dme.ToursProject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tourTime")
public class TourTime extends BaseEntity{
    private String dayNight;
    @OneToMany(mappedBy = "tourTime", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tours> tours;

    public String getDayNight() {
        return dayNight;
    }
    public void setDayNight(String dayNight) {
        this.dayNight = dayNight;
    }
    public List<Tours> getTours() {
        return tours;
    }
    public void setTours(List<Tours> tours) {
        this.tours = tours;
    }
}
