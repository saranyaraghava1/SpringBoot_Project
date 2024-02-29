package com.example.OneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OneToOne.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
