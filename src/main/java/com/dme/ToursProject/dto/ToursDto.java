package com.dme.ToursProject.dto;

import com.dme.ToursProject.entity.Cities;
import com.dme.ToursProject.entity.Services;
import com.dme.ToursProject.entity.Stations;
import com.dme.ToursProject.entity.TourTime;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.HashSet;
import java.util.Set;

public class ToursDto {
    private Long id;
    private String title;
    private String description;
    private int price;
    private Long tourTimeId;
    private String tourTimeDayNight;
    private String foto1;
    private String foto2;
    private String foto3;
    private Set<Long> stationId = new HashSet<>();
    private Set<String> stationName = new HashSet<>();
    private Set<Long> cityId = new HashSet<>();
    private Set<String> cityName = new HashSet<>();
    private Set<Long> serviceId =  new HashSet<>();
    private Set<String> serviceName = new HashSet<>();

    public ToursDto(){

    }

    public ToursDto(Long id, String title, String description, int price, Long tourTimeId, String tourTimeDayNight, String foto1, String foto2, String foto3, Set<Long> stationId, Set<String> stationName, Set<Long> cityId, Set<String> cityName, Set<Long> serviceId, Set<String> serviceName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.tourTimeId = tourTimeId;
        this.tourTimeDayNight = tourTimeDayNight;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.stationId = stationId;
        this.stationName = stationName;
        this.cityId = cityId;
        this.cityName = cityName;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getTourTimeId() {
        return tourTimeId;
    }

    public void setTourTimeId(Long tourTimeId) {
        this.tourTimeId = tourTimeId;
    }

    public String getTourTimeDayNight() {
        return tourTimeDayNight;
    }

    public void setTourTimeDayNight(String tourTimeDayNight) {
        this.tourTimeDayNight = tourTimeDayNight;
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

    public Set<Long> getStationId() {
        return stationId;
    }

    public void setStationId(Set<Long> stationId) {
        this.stationId = stationId;
    }

    public Set<String> getStationName() {
        return stationName;
    }

    public void setStationName(Set<String> stationName) {
        this.stationName = stationName;
    }

    public Set<Long> getCityId() {
        return cityId;
    }

    public void setCityId(Set<Long> cityId) {
        this.cityId = cityId;
    }

    public Set<String> getCityName() {
        return cityName;
    }

    public void setCityName(Set<String> cityName) {
        this.cityName = cityName;
    }

    public Set<Long> getServiceId() {
        return serviceId;
    }

    public void setServiceId(Set<Long> serviceId) {
        this.serviceId = serviceId;
    }

    public Set<String> getServiceName() {
        return serviceName;
    }

    public void setServiceName(Set<String> serviceName) {
        this.serviceName = serviceName;
    }
}
