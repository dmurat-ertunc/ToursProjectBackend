package com.dme.ToursProject.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "stations")
public class Stations extends BaseEntity{
    private String name;
    @ManyToOne
    @JoinColumn(name = "cityId")
    private Cities cities;
    @ManyToMany(mappedBy = "stations")
    private Set<Tours> tours = new HashSet<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Cities getCities() {
        return cities;
    }
    public void setCities(Cities cities) {
        this.cities = cities;
    }
    public Set<Tours> getTours() {
        return tours;
    }
    public void setTours(Set<Tours> tours) {
        this.tours = tours;
    }
}
