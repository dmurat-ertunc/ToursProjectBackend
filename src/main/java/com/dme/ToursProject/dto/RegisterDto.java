package com.dme.ToursProject.dto;

public class RegisterDto {
    private String userName;
    private String mail;
    private String password;
    private String name;
    private String surName;
    private String nationality;

    public RegisterDto(){

    }

    public RegisterDto(String userName, String mail, String password, String name, String surName, String nationality) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.surName = surName;
        this.nationality = nationality;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
