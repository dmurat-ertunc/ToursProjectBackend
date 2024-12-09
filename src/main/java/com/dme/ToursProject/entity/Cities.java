package com.dme.ToursProject.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cities")
public class Cities extends BaseEntity{
    private String name;
    @OneToMany(mappedBy = "cities", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Stations> stations;
    @ManyToMany(mappedBy = "cities")
    private Set<Tours> tours = new HashSet<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Stations> getStations() {
        return stations;
    }
    public void setStations(List<Stations> stations) {
        this.stations = stations;
    }
    public Set<Tours> getTours() {
        return tours;
    }
    public void setTours(Set<Tours> tours) {
        this.tours = tours;
    }
}

