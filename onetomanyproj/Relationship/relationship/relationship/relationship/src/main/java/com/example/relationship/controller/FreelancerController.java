package com.example.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationship.model.Freelancer;
// import com.example.onetomany.model.OrderRequest;
// import com.example.onetomany.repository.ProductsRepo;
import com.example.relationship.service.FreelancerService;
// import com.example.onetomany.service.ProductsService;

@RestController
public class FreelancerController {
    @Autowired
    private FreelancerService repo;

    @PostMapping("/customers")
    public ResponseEntity<Freelancer> insert(@RequestBody Freelancer cus) {
        Freelancer cp = repo.insert(cus);
        return new ResponseEntity<>(cp, HttpStatus.CREATED);
    }
}