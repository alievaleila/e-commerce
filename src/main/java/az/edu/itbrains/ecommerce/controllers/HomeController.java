package az.edu.itbrains.ecommerce.controllers;

import az.edu.itbrains.ecommerce.model.Category;
import az.edu.itbrains.ecommerce.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final CategoryRepository categoryRepository;

    public HomeController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


//    @Autowired
//    private ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        List<Category> categories=categoryRepository.findAll();
        model.addAttribute("categories",categories);
//        Color color=new Color();
//        color.getSizes();
        return "index.html";
    }
}
