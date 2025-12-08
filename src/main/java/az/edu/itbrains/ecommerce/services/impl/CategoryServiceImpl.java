package az.edu.itbrains.ecommerce.services.impl;

import az.edu.itbrains.ecommerce.dtos.category.CategoryDto;
import az.edu.itbrains.ecommerce.model.Category;
import az.edu.itbrains.ecommerce.repositories.CategoryRepository;
import az.edu.itbrains.ecommerce.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getCategories(){
        List<Category>categories=categoryRepository.findAll();
        if(!categories.isEmpty()){
            return categories.stream().map(category -> modelMapper.map(category,CategoryDto.class))
                    .collect(Collectors.toList());
        }
        return List.of();

    }

}
