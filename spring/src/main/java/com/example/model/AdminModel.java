package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AdminModel {
    @Id
    String email;
    String password;
    String mobileNumber;
    String sellerName;
    String userRole;
    String companyName;
    String companyImageURL;
    String companyAddress;
    int earnings;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getSellerName() {
        return sellerName;
    }
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    public String getUserRole() {
        return userRole;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyImageURL() {
        return companyImageURL;
    }
    public void setCompanyImageURL(String companyImageURL) {
        this.companyImageURL = companyImageURL;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public int getEarnings() {
        return earnings;
    }
    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
    
}
