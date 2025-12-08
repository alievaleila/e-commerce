package az.edu.itbrains.ecommerce.services.impl;

import az.edu.itbrains.ecommerce.dtos.product.ProductDetailDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductHomeDto;
import az.edu.itbrains.ecommerce.exceptions.ResourceNotFoundException;
import az.edu.itbrains.ecommerce.model.Product;
import az.edu.itbrains.ecommerce.repositories.ProductRepository;
import az.edu.itbrains.ecommerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<ProductHomeDto> getAllHomeProducts() {
        return List.of();
    }

    @Override
    public ProductDetailDto getProductDetail(Long id) {
        Product product=productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException(id,"Product"));
        if(product!=null){
            return modelMapper.map(product,ProductDetailDto.class);
        }
        return null;
    }
}
