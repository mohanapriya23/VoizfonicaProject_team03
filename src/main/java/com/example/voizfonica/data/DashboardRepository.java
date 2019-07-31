package com.example.voizfonica;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DashboardRepository extends MongoRepository<Edit,String> {


    List<Edit> findByIdAndFull_name(String id,String full_name);

}
