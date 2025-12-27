package az.edu.itbrains.ecommerce.controllers;

import az.edu.itbrains.ecommerce.dtos.category.CategoryDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductBestSellerDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductFeaturedDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductHomeDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductHotTrendDto;
import az.edu.itbrains.ecommerce.services.CategoryService;
import az.edu.itbrains.ecommerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final CategoryService categoryService;
    private final ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        List<ProductHomeDto> products = productService.getAllHomeProducts();
        List<CategoryDto> categories = categoryService.getAllCategories();
        List<ProductFeaturedDto>productFeaturedDtoList=productService.getFeaturedProducts();
        List<ProductHotTrendDto>productHotTrendDtoList=productService.getHotTrendProducts();
        List<ProductBestSellerDto>productBestSellerDtoList=productService.getBestSellerProducts();
        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        return "index.html";
    }

//   private final CategoryRepository categoryRepository;
//
//    public HomeController(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("/")
//    public String home(Model model) {
//        List<Category> categories=categoryRepository.findAll();
//        model.addAttribute("categories",categories);
//        Color color=new Color();
//        color.getSizes();
//        return "index.html";
//    }
}
