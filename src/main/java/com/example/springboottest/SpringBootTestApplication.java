package com.example.springboottest;

import com.example.springboottest.entity.Article;
import com.example.springboottest.dao.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootTestApplication implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepo ;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0 ; i<20 ; i++){
            articleRepo.save(new Article(null , "Java 8 : lambda expressions", "jvrdjhvjkrgdklrgisodoibrlkklbklrlk" , "hamza"  , null , LocalDate.now() , null , null , 12 , null , null
            ));
        }
    }
}
