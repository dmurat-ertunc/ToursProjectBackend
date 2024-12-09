package com.dme.ToursProject.dto;

import java.util.HashSet;
import java.util.Set;

public class ServicesDto {
    private Long id;
    private String name;
    private Set<Long> toursId = new HashSet<>();
    private Set<String> tourTitle = new HashSet<>();
    private Set<String> tourDescription = new HashSet<>();

    public ServicesDto(){

    }

    public ServicesDto(String name, Set<Long> toursId, Set<String> tourTitle,
                       Set<String> tourDescription, Long id) {
        this.name = name;
        this.toursId = toursId;
        this.tourTitle = tourTitle;
        this.tourDescription = tourDescription;
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Long> getToursId() {
        return toursId;
    }
    public void setToursId(Set<Long> toursId) {
        this.toursId = toursId;
    }
    public Set<String> getTourTitle() {
        return tourTitle;
    }
    public void setTourTitle(Set<String> tourTitle) {
        this.tourTitle = tourTitle;
    }
    public Set<String> getTourDescription() {
        return tourDescription;
    }
    public void setTourDescription(Set<String> tourDescription) {
        this.tourDescription = tourDescription;
    }
}
