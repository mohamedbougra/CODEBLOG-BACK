package com.example.springboottest.service;

import com.example.springboottest.entity.Article;
import com.example.springboottest.dao.ArticleRepository;
import com.example.springboottest.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ArticleService {


    @Autowired
    private ArticleRepository articleRepo ;

    // to find all articles
    public List<Article> findAll() {
      return   articleRepo.findAll();
    }
     // find article By id
    public Article findByID(long id) {
        return  articleRepo.findById(id).orElseThrow(()->new RuntimeException("article not found") {
        }) ;
    }
    public void deleteByID(long id) {
        articleRepo.deleteById(id);
    }

    // get latest Articles
    public List<Article> getlatestArticles(){
       return articleRepo.findTop10ArticleByOrderByPublishedAtDesc();
    }

    public Article saveArticle(Article article) {
        article.setCreatedAt(LocalDate.now());
        return articleRepo.save(article);
    }
    public List<Article> searchArticles(String keywords){
        //TODO search for articles ===> mohamed
        return  null ;
    }


    public List<Article> getArticlesByCategory(String categoryName) {
        return  articleRepo.findArticleByCategoriesContains(Collections.singletonList(new Category(null , categoryName , null , null)));
    }
}
