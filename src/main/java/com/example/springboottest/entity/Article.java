package com.example.springboottest.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor // lombok
@NoArgsConstructor  // lombok
@Setter  // lombok
@Getter
@ToString
@Entity
public class Article {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title ;
    private String content ;
    private String author ;
    private LocalDate createdAt ;
    private LocalDate publishedAt ;
    private LocalDate lastModification ;
    private String  heroImage ;
    private Integer viewsNumber ;
    @OneToMany(mappedBy = "article")
    private List<Category> categories ;

    @ManyToOne()
    private Writer writer;


    // claps
    //comments
    // ......

}
