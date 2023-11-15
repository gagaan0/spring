package com.example.mongodb.controller;

import com.example.mongodb.model.Cab;
import com.example.mongodb.repository.CabRepository;
import com.example.mongodb.resource.CabRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CabController {
    private final CabRepository CabRepository;

    public CabController(CabRepository CabRepository) {
        this.CabRepository = CabRepository;
    }

    @GetMapping("/cab")
    public ResponseEntity<List<Cab>> getAllCabs() {
        return ResponseEntity.ok(this.CabRepository.findAll());
    }
    @PostMapping("/cab")
    public ResponseEntity<Cab> createCab(@RequestBody CabRequest CabRequest) {
        Cab Cab = new Cab();
        Cab.setCabname(CabRequest.getCabname());
        Cab.setCabtime(CabRequest.getCabtime());
        return ResponseEntity.status(201).body(this.CabRepository.save(Cab));
    }
    @GetMapping("/cab/{id}")
    public ResponseEntity getAllCabById(@PathVariable String id) {
        Optional<Cab> Cab = this.CabRepository.findById(id);
        if(Cab.isPresent()) {
            return ResponseEntity.ok(Cab.get());
        }else{
            return ResponseEntity.ok("The Cab with id : " + id + " was not found");
        }
    }
    @DeleteMapping("/cab/{id}")
    public ResponseEntity deleteCabById(@PathVariable String id) {
        Optional<Cab> Cab = this.CabRepository.findById(id);

        if(Cab.isPresent())
        {this.CabRepository.deleteById(id);
            return ResponseEntity.ok("success");
        }else{
            return ResponseEntity.ok("The Cab with id : " + id + " was not found");
        }
    }
}