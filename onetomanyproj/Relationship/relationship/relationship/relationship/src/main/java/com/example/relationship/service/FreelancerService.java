package com.example.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationship.model.Freelancer;
import com.example.relationship.repository.FreelancerRepo;

@Service
public class FreelancerService {
    @Autowired
    private FreelancerRepo cr;

    public Freelancer insert(Freelancer c) {
        return cr.save(c);
    }
}