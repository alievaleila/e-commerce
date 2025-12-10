package az.edu.itbrains.ecommerce.controllers.admin;

import az.edu.itbrains.ecommerce.model.Category;
import az.edu.itbrains.ecommerce.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping("/category")
    public String index(Model model) {
        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("category", categoryList);
        return "admin/category.html";
    }

    @PostMapping("/category")
    public String create(Category category) {
        categoryRepository.save(category);
//        System.out.println(category.getName());
        return "redirect:category";
    }

    @GetMapping("/category/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Category findCategory = categoryRepository.findById(id).get();
        model.addAttribute("category", findCategory);
        return "admin/category/edit.html";
    }

    @PostMapping("/category/{id}")
    public String edit(@PathVariable Long id, Category category) {
        Category findCategory = categoryRepository.findById(id).get();
        findCategory.setName(category.getName());
        categoryRepository.save(category);
        return "redirect:category";
    }

    @GetMapping("/category/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        Category findCategory = categoryRepository.findById(id).get();
        model.addAttribute("category", findCategory);
        return "admin/category/delete.html";
    }

    @PostMapping("/category/delete/{id}")
    public String delete(@PathVariable Long id, Category category) {
        Category findCategory = categoryRepository.findById(id).get();
//        findCategory.setName(category.getName());
        categoryRepository.delete(category);
        return "redirect:category";
    }
}
