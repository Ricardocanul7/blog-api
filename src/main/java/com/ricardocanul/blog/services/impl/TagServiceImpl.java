package com.ricardocanul.blog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ricardocanul.blog.domain.entities.Tag;
import com.ricardocanul.blog.repositories.TagRepository;
import com.ricardocanul.blog.services.TagService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAllWithPostCount();
    }

}
