package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingsModel {
    
    @Id
    String bikeID;
    String adminID;
    String userEmail;

    public String getBikeID() {
        return bikeID;
    }
    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }
    public String getAdminID() {
        return adminID;
    }
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    
}
