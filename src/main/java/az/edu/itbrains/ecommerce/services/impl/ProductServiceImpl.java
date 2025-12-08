package az.edu.itbrains.ecommerce.services.impl;

import az.edu.itbrains.ecommerce.dtos.product.ProductDetailDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductHomeDto;
import az.edu.itbrains.ecommerce.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductHomeDto> getAllHomeProducts() {
        return List.of();
    }

    @Override
    public ProductDetailDto getProductDetail(Long id) {
        return null;
    }
}
