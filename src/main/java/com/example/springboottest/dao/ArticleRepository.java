package com.example.springboottest.dao;

import com.example.springboottest.entity.Article;
import com.example.springboottest.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    // save
    // delete
    // edit
    // find
    List<Article> findTop10ArticleByOrderByPublishedAtDesc(); // this method is used to find the latest published 10 articles

    List<Article> findArticleByCategoriesContains(List<Category> categories);
    // get latest articles  select * from Article Order By datepub  desc  limit 10 ; //
}

