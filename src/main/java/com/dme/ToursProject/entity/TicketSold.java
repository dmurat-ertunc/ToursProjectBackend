package com.dme.ToursProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticketSold")
public class TicketSold extends BaseEntity{
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Long identityNumber;
    private String pnrNo;
    @ManyToOne
    @JoinColumn(name = "plannedTourId")
    private PlannedTours plannedTours;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Long getIdentityNumber() {
        return identityNumber;
    }
    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }
    public String getPnrNo() {
        return pnrNo;
    }
    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }
    public PlannedTours getTours() {
        return plannedTours;
    }
    public void setTours(PlannedTours plannedTours) {
        this.plannedTours = plannedTours;
    }

    public PlannedTours getPlannedTours() {
        return plannedTours;
    }

    public void setPlannedTours(PlannedTours plannedTours) {
        this.plannedTours = plannedTours;
    }
}
