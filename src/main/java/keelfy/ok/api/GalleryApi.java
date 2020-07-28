package keelfy.ok.api;

import keelfy.ok.model.Category;
import keelfy.ok.model.Post;
import keelfy.ok.service.CategoryService;
import keelfy.ok.service.GalleryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author keelfy
 */
@RestController
@RequestMapping("/api/gallery")
@RequiredArgsConstructor
public class GalleryApi {

    private final GalleryService galleryService;

    @GetMapping
    public List<Post> listPosts() {
        return galleryService.findAll();
    }

    @GetMapping("{category_id}")
    public List<Post> listCategoryPosts(@PathVariable("category_id") Category category) {
        return galleryService.findByCategory(category);
    }
}
