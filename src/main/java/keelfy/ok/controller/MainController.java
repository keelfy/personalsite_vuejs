package keelfy.ok.controller;

import keelfy.ok.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author keelfy
 */
@Controller
@RequestMapping
@RequiredArgsConstructor
public class MainController {

    @Value("${spring.profiles.active:release}")
    private String profile;

    @GetMapping(value = { "/", "gallery", "contact", "categories" })
    public String index(Model model) {
        model.addAttribute("isDevMode", "dev".equals(profile));
        model.addAttribute("title", "Oleg Kuzmin");
        return "index";
    }

}
