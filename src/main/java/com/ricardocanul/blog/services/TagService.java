package com.ricardocanul.blog.services;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.ricardocanul.blog.domain.entities.Tag;

public interface TagService {
    List<Tag> getTags();

    List<Tag> createTags(Set<String> tagNames);

    void deleteTag(UUID id);

    Tag getTagById(UUID id);
}
