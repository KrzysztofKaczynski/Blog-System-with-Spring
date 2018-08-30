package pl.malykriszo.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.malykriszo.blog.models.User;
import pl.malykriszo.blog.repositories.UserRepository;

import java.util.List;

@Service
@Primary
public class UserServiceJpaImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> findAll() {
        return this.userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return this.userRepo.findOne(id);
    }

    @Override
    public User create(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User edit(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public void deleteById(Long id) {
        this.userRepo.delete(id);
    }
}
