package com.ricardocanul.blog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardocanul.blog.domain.dtos.CategoryDto;
import com.ricardocanul.blog.mappers.CategoryMapper;
import com.ricardocanul.blog.services.CategoryService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategories() {
        List<CategoryDto> categories = categoryService.listCategories().stream()
                .map(categoryMapper::toDto)
                .toList();

        return ResponseEntity.ok(categories);
    }

}
