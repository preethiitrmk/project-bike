package com.example.DAO;

import java.util.List;


import com.example.model.BikeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepo extends JpaRepository<BikeModel,String>{
    
    public List<BikeModel> findByAdminID(String adminID);

}
