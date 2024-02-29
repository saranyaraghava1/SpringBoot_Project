package com.example.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.relationship.model.Job;
import com.example.relationship.repository.JobRepo;

public class JobService {
    @Autowired
    private JobRepo cr;

    public Job insert(Job c) {
        return cr.save(c);
    }
}