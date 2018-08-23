package pl.malykriszo.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.malykriszo.blog.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
