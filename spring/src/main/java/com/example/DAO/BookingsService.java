package com.example.DAO;

import com.example.model.BookingsModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingsService {

        @Autowired
        BookingsRepo bookingsRepo;

        public void addBooking(String bikeID, String adminID, String userEmail){
            BookingsModel newBooking=new BookingsModel();
            newBooking.setBikeID(bikeID);
            newBooking.setAdminID(adminID);
            newBooking.setUserEmail(userEmail);
            bookingsRepo.save(newBooking);
        }

}
