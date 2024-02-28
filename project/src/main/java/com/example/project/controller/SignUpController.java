package com.example.project.controller;

import java.util.List;

// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.SignUp;
import com.example.project.service.SignUpService;

@RestController
public class SignUpController {
    @Autowired
    SignUpService obj;

    @PostMapping("/create")
    public ResponseEntity<SignUp> insert(@RequestBody SignUp j) {
        return new ResponseEntity<>(obj.create(j), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public SignUp fin(@PathVariable int id) {
        return obj.find(id);
    }

    @GetMapping("/all")
    public List<SignUp> findA() {
        return obj.findA();
    }

    @PutMapping("/update/{id}")
    public SignUp update(@PathVariable int id, @RequestBody SignUp u) {
        return obj.update(id, u);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        obj.delete(id);

    }

}
