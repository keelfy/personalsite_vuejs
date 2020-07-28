package keelfy.ok.repository;

import keelfy.ok.model.Category;
import keelfy.ok.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author keelfy
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByCategory(Category category);
}
