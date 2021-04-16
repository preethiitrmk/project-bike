package com.example.controller;

import java.util.List;

import com.example.DAO.BikeService;
import com.example.DAO.BookingsService;
import com.example.model.BikeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BikeController {
    
    @Autowired
    BikeService bikeService;

    @Autowired
    BookingsService bookingsService;

    @PostMapping(value={"/user/bikes","/admin/dashboard"})
    public List<BikeModel> getBikes(@RequestParam String adminID) {
        return bikeService.getBikes(adminID);
    }

    @GetMapping("/user/dashboard")
    public List<BikeModel> getAllBikes(){
        return bikeService.getAllBikes();
    }

    @PostMapping("/admin/addBike")
    public void addBike(@RequestBody BikeModel bike) {
        bikeService.addBike(bike);
    }

    @PostMapping("/admin/deleteBike")
    public void deleteBike(@RequestParam String bikeID) {
        bikeService.deleteBike(bikeID);
    }

    @PostMapping("/admin/editBike")
    public void editBike(@RequestBody BikeModel bike) {
        bikeService.editBike(bike);
    }

    @PostMapping("/user/bookBike")
    public void bookBike(@RequestParam String bikeID, @RequestParam String adminID, @RequestParam String userEmail) {
        bikeService.bookBike(bikeID);
        bookingsService.addBooking(bikeID,adminID,userEmail);
    }


}
