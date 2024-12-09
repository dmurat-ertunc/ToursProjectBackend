package com.dme.ToursProject.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tours")
public class Tours extends BaseEntity{
    private String title;
    private String description;
    private int price;
    @ManyToOne
    @JoinColumn(name = "tourTimeId")
    private TourTime tourTime;
    private String foto1;
    private String foto2;
    private String foto3;
    @OneToMany(mappedBy = "tours", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comments> comments;
    @ManyToMany
    @JoinTable(
            name = "tours_stations", // ilişkiyi temsil eden ara tablo
            joinColumns = @JoinColumn(name = "tourId"),
            inverseJoinColumns = @JoinColumn(name = "stationId")
    )
    private Set<Stations> stations = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "tours_services", // ilişkiyi temsil eden ara tablo
            joinColumns = @JoinColumn(name = "tourId"),
            inverseJoinColumns = @JoinColumn(name = "serviceId")
    )
    private Set<Services> services = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "tours_cities", // ilişkiyi temsil eden ara tablo
            joinColumns = @JoinColumn(name = "tourId"),
            inverseJoinColumns = @JoinColumn(name = "cityId")
    )
    private Set<Cities> cities = new HashSet<>();
    @OneToMany(mappedBy = "tours", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PlannedTours> plannedTours;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public TourTime getTourTime() {
        return tourTime;
    }
    public void setTourTime(TourTime tourTime) {
        this.tourTime = tourTime;
    }
    public String getFoto1() {
        return foto1;
    }
    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }
    public String getFoto2() {
        return foto2;
    }
    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }
    public String getFoto3() {
        return foto3;
    }
    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }
    public List<Comments> getComments() {
        return comments;
    }
    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
    public Set<Stations> getStations() {
        return stations;
    }
    public void setStations(Set<Stations> stations) {
        this.stations = stations;
    }
    public Set<Services> getServices() {
        return services;
    }
    public void setServices(Set<Services> services) {
        this.services = services;
    }
    public Set<Cities> getCities() {
        return cities;
    }
    public void setCities(Set<Cities> cities) {
        this.cities = cities;
    }
    public List<PlannedTours> getPlannedTours() {
        return plannedTours;
    }
    public void setPlannedTours(List<PlannedTours> plannedTours) {
        this.plannedTours = plannedTours;
    }
}
