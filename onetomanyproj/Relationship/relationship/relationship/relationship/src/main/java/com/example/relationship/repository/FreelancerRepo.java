package com.example.relationship.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.model.Freelancer;

@Repository
public interface FreelancerRepo extends JpaRepository<Freelancer, Integer> {

}