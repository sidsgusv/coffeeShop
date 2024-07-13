package com.example.coffeeshopapl.service;


import com.example.coffeeshopapl.model.entity.Category;
import com.example.coffeeshopapl.model.entity.CategoryNameEnum;

public interface CategoryService {
    void initCategories();


    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
