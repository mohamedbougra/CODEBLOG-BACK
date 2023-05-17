package com.example.springboottest.service;

import com.example.springboottest.dao.WriterRepository;
import com.example.springboottest.entity.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WriterService {
    @Autowired
    WriterRepository WriterRepo ;
    public Writer findByUsername(String username){
     return WriterRepo.findByUserName(username).orElseThrow(()->new RuntimeException("writer not found") {
     });
    }
    public Writer updateWriter(Writer writer){
        return WriterRepo.save(writer);
    }
    public Writer addWriter(Writer writer){
        return WriterRepo.save(writer);
    }

}
