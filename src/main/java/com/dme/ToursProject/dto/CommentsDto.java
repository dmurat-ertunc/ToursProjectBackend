package com.dme.ToursProject.dto;

public class CommentsDto {
    private Long id;
    private String text;
    private String name;
    private String surname;
    private String email;
    private Long tourId;
    private String tourTitle;
    private String tourDescription;

    public CommentsDto(){

    }

    public CommentsDto(String text, String name, String surname, String email, Long tourId,
                       String tourTitle, String tourDescriptioni, Long id) {
        this.text = text;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.tourId = tourId;
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
    public Long getTourId() {
        return tourId;
    }
    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }
    public String getTourTitle() {
        return tourTitle;
    }
    public void setTourTitle(String tourTitle) {
        this.tourTitle = tourTitle;
    }
    public String getTourDescription() {
        return tourDescription;
    }
    public void setTourDescription(String tourDescription) {
        this.tourDescription = tourDescription;
    }
}
