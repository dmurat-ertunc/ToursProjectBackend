package com.dme.ToursProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "services")
public class Services extends BaseEntity{
    private String name;
    @ManyToMany(mappedBy = "services")
    private Set<Tours> tours = new HashSet<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Tours> getTours() {
        return tours;
    }
    public void setTours(Set<Tours> tours) {
        this.tours = tours;
    }
}
