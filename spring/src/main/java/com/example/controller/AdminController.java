package com.example.controller;

import com.example.DAO.AdminService;
import com.example.model.AdminModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping("/admin/profile")
    public AdminModel getProfile(@RequestParam String adminId){
        return adminService.getProfile(adminId);
    }
    
    @PostMapping("/admin/editProfile")
    public void editProfile(@RequestBody AdminModel admin){
        adminService.editProfile(admin);
    }

    @PostMapping("/super/deleteAdmin")
    public void deleteAdmin(@RequestParam String adminID){
        adminService.deleteAdmin(adminID);
    }

    @PostMapping("/super/deleteUser")
    public void deleteUser(@RequestParam String email){
        adminService.deleteUser(email);
    }
}
