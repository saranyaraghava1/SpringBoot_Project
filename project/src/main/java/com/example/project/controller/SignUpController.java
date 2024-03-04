package com.example.project.controller;

import java.util.List;
import org.springframework.data.domain.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    public static final Logger logger = LoggerFactory.getLogger(SignUpController.class);

    @RequestMapping("/api")
    public String message() {

        logger.info("INFO enabled");
        logger.error("Error Enabled");
        logger.debug("Debug Enabled");

        return "Test Logging";
    }

    @GetMapping("/{id}")
    public SignUp fin(@PathVariable int id) {
        return obj.find(id);
    }

    @GetMapping("/all")
    public List<SignUp> findA() {
        return obj.findA();
    }

    @GetMapping("/allPaginatedAndSorted")
    public Page<SignUp> findAllPaginatedAndSorted(
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "ASC") String direction) {
        return obj.findAllPaginatedAndSorted(pageNo, pageSize, sortBy, direction);
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
