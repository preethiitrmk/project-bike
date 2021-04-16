package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BikeModel {
    
    @Id
    String bikeID;
    String bikeNo;
    String adminID;
    String status;
    String price;
    String type;
    
    public String getBikeID() {
        return bikeID;
    }
    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }
    public String getBikeNo() {
        return bikeNo;
    }
    public void setBikeNo(String bikeNo) {
        this.bikeNo = bikeNo;
    }
    public String getAdminID() {
        return adminID;
    }
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    

    
}
