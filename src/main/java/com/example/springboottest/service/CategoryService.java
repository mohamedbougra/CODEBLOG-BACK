package com.example.springboottest.service;

import com.example.springboottest.dao.CategoryRepository;
import com.example.springboottest.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository ;

    // getTop10Categories
    public List<Category> getAllCategories(){

        return  categoryRepository.findAll() ;
    }

}
