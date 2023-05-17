package com.example.springboottest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Writer {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
     private Long id ;
     private String firstName ;
     private String lastName ;
     private String email ;
     private String phone ;
     private String userName ;
     private String CompanyName ;
     private String job;
     private String linkedInProfile ;
     private String githubProfile ;
     private String ProfileImage ;
     private String bio ;
     private Integer yearsOfExperience ;
     // list of followers
     @OneToMany(mappedBy = "writer")
     private List<Article> articleList ;
     @OneToMany(mappedBy = "writer")
     private List<Category> categories ;



}
