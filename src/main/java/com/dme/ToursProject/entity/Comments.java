package com.dme.ToursProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comments extends BaseEntity{

    private String text;
    private String name;
    private String surname;
    private String email;
    @ManyToOne
    @JoinColumn(name = "tourId")
    private Tours tours;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
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
    public Tours getTours() {
        return tours;
    }
    public void setTours(Tours tours) {
        this.tours = tours;
    }

}
