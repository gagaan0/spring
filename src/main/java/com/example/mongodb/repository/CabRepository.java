package com.example.mongodb.repository;

import com.example.mongodb.model.Cab;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CabRepository extends MongoRepository <Cab, String> {
}
