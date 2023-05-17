package com.example.springboottest.web;
import com.example.springboottest.entity.Article;
import com.example.springboottest.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ArticleController {

    @Autowired
    private ArticleService articleService ;

    @GetMapping("/articles/all") // /articles/all
    public List<Article> getArticles(){
        return articleService.findAll();
    }
    // /edit   /articles/edit
   @GetMapping("/article/{id}")
   public Article getArticleById(@PathVariable long id){
       return articleService.findByID(id);
   }
    @PostMapping("/article/{id}")
    public Article readArticle(@PathVariable long id){
        return articleService.readArticle(id);
    }
    @DeleteMapping ("/delete")
    public void DeleteArticleById(@RequestParam long id){
        articleService.deleteByID(id);

    }

    @GetMapping("/articles/latest")
    public List<Article> getlatestArticles(){
        return articleService.getlatestArticles();
    }
    @PostMapping("/save-Article")
    public Article saveArticle(@RequestBody Article article) {
      return  articleService.saveArticle(article);
    }

   // @GetMapping("/category/{category}")
    //public List<Article> getArticleByCategory(@PathVariable  String category){
   //    return articleService.getArticlesByCategory(category);
   // }

    @PostMapping("/readArticle/{id}")
    public Article saveArticle(@PathVariable Long id) {
       Article article = articleService.findByID(id) ;
       article.setViewsNumber(article.getViewsNumber() + 1);
       articleService.saveArticle(article);
        return  article ;
    }
    @GetMapping("/search")
    public List<Article> searchArticles(@RequestParam("search") String keyword){
        return articleService.searchArticles(keyword,keyword,keyword);
    }
}
