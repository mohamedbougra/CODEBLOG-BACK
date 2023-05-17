package com.example.springboottest.web;

import com.example.springboottest.entity.Category;
import com.example.springboottest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService ;

    @GetMapping("/all")
    public List<Category> getAllCatgories(){
        return  categoryService.getAllCategories();
    }
}
