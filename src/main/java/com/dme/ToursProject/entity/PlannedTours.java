package com.dme.ToursProject.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "plannedTours")
public class PlannedTours extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "toursId")
    private Tours tours;
    private LocalDate startDate;
    private LocalTime startTime;
    private String startLocation;
    @OneToMany(mappedBy = "plannedTours", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TicketSold> ticketSolds;

    public Tours getTours() {
        return tours;
    }
    public void setTours(Tours tours) {
        this.tours = tours;
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
    public List<TicketSold> getTicketSolds() {
        return ticketSolds;
    }
    public void setTicketSolds(List<TicketSold> ticketSolds) {
        this.ticketSolds = ticketSolds;
    }
}
