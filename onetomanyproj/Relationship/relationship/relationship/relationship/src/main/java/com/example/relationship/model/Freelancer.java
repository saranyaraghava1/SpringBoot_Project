
package com.example.relationship.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Freelancer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int fid;
    private String fName;
    private int hiredquantity;

    public Freelancer() {
    }

    public Freelancer(int fid, String fName, int hiredquantity) {
        this.fid = fid;
        this.fName = fName;
        this.hiredquantity = hiredquantity;
    }

    public int getfid() {
        return fid;
    }

    public void setfid(int fid) {
        this.fid = fid;
    }

    public String getfName() {
        return fName;
    }

    public void setjName(String fName) {
        this.fName = fName;
    }

    public int getQuantity() {
        return hiredquantity;
    }

    public void setQuantity(int hiredquantity) {
        this.hiredquantity = hiredquantity;
    }

}