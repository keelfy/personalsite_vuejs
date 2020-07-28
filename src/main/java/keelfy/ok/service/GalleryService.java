package keelfy.ok.service;

import keelfy.ok.model.Category;
import keelfy.ok.model.Post;
import keelfy.ok.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author keelfy
 */
@Service
@RequiredArgsConstructor
public class GalleryService {

    private final PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public List<Post> findByCategory(Category category) {
        return postRepository.findByCategory(category);
    }
}
