package com.example.DAO;

import com.example.model.AdminModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepo adminRepo;
    @Autowired
    UserRepo userRepo;
    public AdminModel getProfile(String adminId){
        return adminRepo.findById(adminId).get();
    }
    public void editProfile(AdminModel admin){
        adminRepo.save(admin);
    }
    public void deleteAdmin(String adminID){
        adminRepo.deleteById(adminID);
    }
    public void deleteUser(String email){
        userRepo.deleteById(email);
    }
}
