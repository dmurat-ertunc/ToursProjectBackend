package com.dme.ToursProject.dto;

import com.dme.ToursProject.entity.Tours;


import java.time.LocalDate;
import java.time.LocalTime;

public class PlannedToursDto {
    private Long id;
    private Long toursId;
    private String toursTitle;
    private String toursDescription;
    private LocalDate startDate;
    private LocalTime startTime;
    private String startLocation;
    private int quota;

    public PlannedToursDto(){

    }

    public PlannedToursDto(Long toursId, String toursTitle, String toursDescription, LocalDate startDate,
                           LocalTime startTime, String startLocation, Long id,int quota) {
        this.toursId = toursId;
        this.toursTitle = toursTitle;
        this.toursDescription = toursDescription;
        this.startDate = startDate;
        this.startTime = startTime;
        this.startLocation = startLocation;
        this.id = id;
        this.quota=quota;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getToursId() {
        return toursId;
    }
    public void setToursId(Long toursId) {
        this.toursId = toursId;
    }
    public String getToursTitle() {
        return toursTitle;
    }
    public void setToursTitle(String toursTitle) {
        this.toursTitle = toursTitle;
    }
    public String getToursDescription() {
        return toursDescription;
    }
    public void setToursDescription(String toursDescription) {
        this.toursDescription = toursDescription;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    public String getStartLocation() {
        return startLocation;
    }
    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}
