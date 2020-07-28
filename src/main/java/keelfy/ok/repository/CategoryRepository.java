package keelfy.ok.repository;

import keelfy.ok.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author keelfy
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
