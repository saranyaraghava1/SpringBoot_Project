package com.example.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Integer> {

}