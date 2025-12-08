package az.edu.itbrains.ecommerce.helpers;

import az.edu.itbrains.ecommerce.model.Category;
import az.edu.itbrains.ecommerce.repositories.CategoryRepository;
import az.edu.itbrains.ecommerce.repositories.ColorRepository;
import az.edu.itbrains.ecommerce.repositories.PhotoRepository;
import az.edu.itbrains.ecommerce.repositories.ProductRepository;
import az.edu.itbrains.ecommerce.repositories.SizeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ColorRepository colorRepository;
    private final SizeRepository sizeRepository;
    private final PhotoRepository photoRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty()) {
            List<Category> categoryList = List.of(
                    new Category("Man"),
                    new Category("Woman"),
                    new Category("T-Shirts"),
                    new Category("Hoodies & Sweatshirts"),
                    new Category("Jeans"),
                    new Category("Pants & Trousers"),
                    new Category("Shorts"),
                    new Category("Jackets & Coats"),
                    new Category("Suits & Blazers"),
                    new Category("Shoes"),
                    new Category("Sneakers"),
                    new Category("Bags"),
                    new Category("Accessories"),
                    new Category("Dresses"),
                    new Category("Skirts"),
                    new Category("Blouses"),
                    new Category("Cardigans"),
                    new Category("Knitwear"),
                    new Category("Underwear"),
                    new Category("Sportswear"),
                    new Category("Swimwear"),
                    new Category("Premium Collection")
            );
            categoryRepository.saveAll(categoryList);

            System.out.println("Salam!");

        }
    }
}
