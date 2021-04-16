package com.example.DAO;

import java.util.List;
import java.util.Optional;

import com.example.model.BikeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {

    @Autowired
    BikeRepo bikeRepo;

    @Autowired
    BookingsRepo bookingsRepo;

    public List<BikeModel> getBikes(String adminID){
		return bikeRepo.findByAdminID(adminID);
	}

    public List<BikeModel> getAllBikes(){
        return bikeRepo.findAll();
    }

    public void addBike(BikeModel bike){
        bikeRepo.save(bike);
    }

    public void editBike(BikeModel bike){
        bikeRepo.save(bike);
    }

    public void deleteBike(String bikeID){
        
        if(bikeRepo.findById(bikeID).get().getStatus().equals("booked"))
            bookingsRepo.deleteById(bikeID);
        bikeRepo.deleteById(bikeID);
    }

    public void bookBike(String bikeID){
        Optional<BikeModel> l=bikeRepo.findById(bikeID);
        BikeModel bike=l.get();
        bike.setStatus("booked");
        bikeRepo.save(bike);
    }

    public BikeModel getBikeDetails(String bikeID){
        return bikeRepo.findById(bikeID).get();
    }
}
