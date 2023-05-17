package com.example.springboottest.service;

import com.example.springboottest.dao.EmailRepository;
import com.example.springboottest.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmailListService {

    @Autowired
    private EmailRepository emailRepository ;

    public boolean subscribe(String email) {
        emailRepository.save(new Email( null, email , LocalDate.now() ));
        // TODO : send a welcome email to the user.
        return true ;
    }
    public void deleteEmailbyId(long id) {
        emailRepository.deleteById(id);
    }
}
