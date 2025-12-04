package az.edu.itbrains.ecommerce.controllers.admin;

import az.edu.itbrains.ecommerce.model.Category;
import az.edu.itbrains.ecommerce.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoyController {

    private final CategoryRepository categoryRepository;

    public CategoyController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories")
    public String index(Model model) {
        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("categories", categoryList);
        return "admin/category.html";
    }


    @PostMapping("/categories")
    public String create(Category category) {
        categoryRepository.save(category);
//        System.out.println(category.getName());
        return "redirect:categories";
    }

    @GetMapping("/categories/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Category findCategory = categoryRepository.findById(id).get();
        model.addAttribute("category", findCategory);
        return "admin/category/edit.html";
    }

    @PostMapping("/categories/{id}")
    public String edit(@PathVariable Long id ,Category category){
        Category findCategory = categoryRepository.findById(id).get();
        findCategory.setName(category.getName());
        categoryRepository.save(category);
        return "redirect:categories";
    }
    @GetMapping("/categories/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        Category findCategory = categoryRepository.findById(id).get();
        model.addAttribute("category", findCategory);
        return "admin/category/delete.html";
    }

    @PostMapping("/categories/delete/{id}")
    public String delete(@PathVariable Long id ,Category category){
        Category findCategory = categoryRepository.findById(id).get();
//        findCategory.setName(category.getName());
        categoryRepository.delete(category);
        return "redirect:categories";
    }
}
