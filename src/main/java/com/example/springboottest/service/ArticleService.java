package com.example.springboottest.service;

import com.example.springboottest.entity.Article;
import com.example.springboottest.dao.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
    //incrementer number of views
    public Article readArticle(long id){
        //incrementer number of views
        Article article=findByID(id);
        article.setViewsNumber(article.getViewsNumber()+1);
        return article;
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
    public List<Article> searchArticles(String keyword1,String keyword2,String keyword3){
        //TODO search for articles ===> mohamed ok
        //find by keyword order by title , content and author also by viewsNumber and PublishedAt
       return articleRepo.findByTitleContainingIgnoreCaseOrContentContainingIgnoreCaseOrAuthorContainingIgnoreCaseOrderByTitleDescContentDescAuthorDescViewsNumberDescPublishedAtDesc(keyword1,keyword2,keyword3);

    }


   // public List<Article> getArticlesByCategory(String categoryName) {
    //    return  articleRepo.findArticleByCategoriesContains(Collections.singletonList(new Category(null , categoryName , null , null)));
   // }




}
