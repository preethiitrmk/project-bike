package com.example.controller;

import java.util.List;

import com.example.DAO.BikeService;
import com.example.DAO.UserService;
import com.example.model.AdminModel;
import com.example.model.BikeModel;
import com.example.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @Autowired
    UserService userService;

    @Autowired
    BikeService bikeService;

    @PostMapping("/user/bookings")
    public List<BikeModel> getBookings(@RequestParam String userEmail) {
        return userService.getBookings(userEmail);
    }
    
    @PostMapping("/user/bikeDetails")
    public BikeModel getBikeDetails(@RequestParam String bikeID){
        return bikeService.getBikeDetails(bikeID);
    }

    @PostMapping("/user/editProfile")
    public void editUser(@RequestBody UserModel user){
        userService.editUser(user);
    }

}
