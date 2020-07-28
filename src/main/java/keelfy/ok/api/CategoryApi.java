package keelfy.ok.api;

import keelfy.ok.model.Category;
import keelfy.ok.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author keelfy
 */
@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryApi {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> listCategories() {
        return categoryService.findAll();
    }

}
