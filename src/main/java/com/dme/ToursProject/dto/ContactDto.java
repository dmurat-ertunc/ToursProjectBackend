package com.dme.ToursProject.dto;

public class ContactDto {

    private Long id;
    private String name;
    private String surname;
    private String subject;
    private String message;
    private String email;
    private String phoneNumber;

    public ContactDto(){

    }

    public ContactDto(String name, String surname, String subject, String message, String email,
                      String phoneNumber, Long id) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.message = message;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
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
}
