package com.dme.ToursProject.dto;

import com.dme.ToursProject.entity.Tours;

public class TicketSoldDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Long identityNumber;
    private String pnrNo;
    private Long plannedToursId;
    private String plannedTourTitle;
    private String plannedTourDescription;

    public TicketSoldDto(){

    }

    public TicketSoldDto(String name, String surname, String email, String phoneNumber,
                         Long identityNumber, String pnrNo, Long plannedToursId, String plannedTourTitle,
                         String plannedTourDescription, Long id) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.identityNumber = identityNumber;
        this.pnrNo = pnrNo;
        this.plannedToursId = plannedToursId;
        this.plannedTourTitle = plannedTourTitle;
        this.plannedTourDescription = plannedTourDescription;
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

    public Long getPlannedToursId() {
        return plannedToursId;
    }

    public void setPlannedToursId(Long plannedToursId) {
        this.plannedToursId = plannedToursId;
    }

    public String getPlannedTourTitle() {
        return plannedTourTitle;
    }

    public void setPlannedTourTitle(String plannedTourTitle) {
        this.plannedTourTitle = plannedTourTitle;
    }

    public String getPlannedTourDescription() {
        return plannedTourDescription;
    }

    public void setPlannedTourDescription(String plannedTourDescription) {
        this.plannedTourDescription = plannedTourDescription;
    }
}
