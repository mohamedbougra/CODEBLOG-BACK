package com.example.springboottest.web;

import com.example.springboottest.service.EmailListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newsletter")
public class EmailListController {

    @Autowired
    private EmailListService emailListService ;
    // http://localhost:8080/newsletter/subscribe/hamza@gmail.com
    // TODO : learn the difference @PathVariable & @RequestParam
    @PostMapping("/subscribe/{email}")
    public Boolean subscribe(@PathVariable String email){
      return   emailListService.subscribe(email);
    }

}
