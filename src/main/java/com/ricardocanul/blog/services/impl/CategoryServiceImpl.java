package com.ricardocanul.blog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ricardocanul.blog.domain.entities.Category;
import com.ricardocanul.blog.repositories.CategoryRepository;
import com.ricardocanul.blog.services.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }

}
