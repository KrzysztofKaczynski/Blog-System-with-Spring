package pl.malykriszo.blog.repositories;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.malykriszo.blog.models.Post;

import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p LEFT JOIN FETCH p.author ORDER BY p.date DESC")
    List<Post> findLatestFivePosts(SpringDataWebProperties.Pageable pageable);

}