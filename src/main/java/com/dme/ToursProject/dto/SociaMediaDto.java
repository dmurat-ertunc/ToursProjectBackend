package com.dme.ToursProject.dto;

public class SociaMediaDto {
    private Long id;
    private String instagram;
    private String facebook;
    private String twitter;
    private String email;
    private String phoneNumber;

    public SociaMediaDto(){

    }

    public SociaMediaDto(String instagram, String facebook, String twitter, String email,
                         String phoneNumber, Long id) {
        this.instagram = instagram;
        this.facebook = facebook;
        this.twitter = twitter;
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
    public String getInstagram() {
        return instagram;
    }
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    public String getFacebook() {
        return facebook;
    }
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    public String getTwitter() {
        return twitter;
    }
    public void setTwitter(String twitter) {
        this.twitter = twitter;
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
