package com.ricardocanul.blog.services;

import java.util.List;

import com.ricardocanul.blog.domain.entities.Category;

public interface CategoryService {
    List<Category> listCategories();
}
