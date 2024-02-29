package com.example.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.example.project.model.SignUp;
import com.example.project.repository.SignUpRepo;

@Service
public class SignUpService {
    @Autowired
    SignUpRepo repo;

    public SignUp create(SignUp j) {
        return repo.save(j);
        // return true;
    }

    public SignUp find(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<SignUp> findA() {
        return repo.findAll();
    }

    public SignUp update(int id, SignUp j) {
        SignUp p1 = repo.findById(id).orElse(null);
        if (p1 != null) {
            p1.setName(j.getName());
            repo.save(p1);
            return p1;
        } else {
            return j;
        }
    }

    public void delete(int id) {
        repo.deleteById(id);

    }

    public Page<SignUp> findAllPaginatedAndSorted(int pageNo, int pageSize, String sortBy, String direction) {
        Sort sort = Sort.by(Sort.Direction.fromString(direction), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return repo.findAll(pageable);
    }
}
