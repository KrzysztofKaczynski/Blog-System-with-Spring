package pl.malykriszo.blog.services;

import org.springframework.stereotype.Service;
import pl.malykriszo.blog.models.Post;
import pl.malykriszo.blog.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * pl.malykriszo.blog.services Created by MałyKriszo on 2018-08-28.
 *
 * Only for test
 */
@Service
public class UserServiceSampleDataInMemory implements UserService {

    @Override
    public boolean authenticate(String username, String password) {
        return Objects.equals(username, password);
    }
}