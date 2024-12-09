package com.dme.ToursProject.dto;

import java.util.HashSet;
import java.util.Set;

public class CitiesDto {
    private Long id;
    private String name;
    private Set<Long> tourIds = new HashSet<>();
    private Set<String> tourTitle = new HashSet<>();
    private Set<String> tourDescription = new HashSet<>();

    public CitiesDto(String name, Set<Long> tourIds, Set<String> tourTitle, Set<String> tourDescription,
                     Long id) {
        this.name = name;
        this.tourIds = tourIds;
        this.tourTitle = tourTitle;
        this.tourDescription = tourDescription;
        this.id = id;
    }

    public CitiesDto(){

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
    public Set<Long> getTourIds() {
        return tourIds;
    }
    public void setTourIds(Set<Long> tourIds) {
        this.tourIds = tourIds;
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
