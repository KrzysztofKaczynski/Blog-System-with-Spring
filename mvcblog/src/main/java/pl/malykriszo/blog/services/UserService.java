package pl.malykriszo.blog.services;

/**
 * pl.malykriszo.blog.services Created by MałyKriszo on 2018-08-30.
 */
public interface UserService {

    boolean authenticate(String username, String password);

}
