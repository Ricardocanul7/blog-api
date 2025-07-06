package com.ricardocanul.blog.services;

import java.util.List;

import com.ricardocanul.blog.domain.entities.Tag;

public interface TagService {
    List<Tag> getTags();
}
