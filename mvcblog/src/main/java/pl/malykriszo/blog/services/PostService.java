package pl.malykriszo.blog.services;

import pl.malykriszo.blog.models.Post;

import java.util.List;

/**
 * pl.malykriszo.blog.services Created by MałyKriszo on 2018-08-28.
 */
public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
