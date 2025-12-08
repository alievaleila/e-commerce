package az.edu.itbrains.ecommerce.services;

import az.edu.itbrains.ecommerce.dtos.category.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getCategories();
}
