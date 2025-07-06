package com.ricardocanul.blog.services;

import java.util.List;
import java.util.UUID;

import com.ricardocanul.blog.domain.entities.Post;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
}
