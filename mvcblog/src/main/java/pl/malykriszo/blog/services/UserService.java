package pl.malykriszo.blog.services;

import pl.malykriszo.blog.models.User;

import java.util.List;

/**
 * pl.malykriszo.blog.services Created by MałyKriszo on 2018-08-30.
 */
public interface UserService {

    List<User>findAll();
    User findById(Long id);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);

}
