package com.dme.ToursProject.dto;

public class TourTimeDto {
    private Long id;
    private String dayNight;

    public TourTimeDto(){

    }

    public TourTimeDto(Long id, String dayNight) {
        this.id = id;
        this.dayNight = dayNight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDayNight() {
        return dayNight;
    }

    public void setDayNight(String dayNight) {
        this.dayNight = dayNight;
    }
}
