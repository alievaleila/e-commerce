package az.edu.itbrains.ecommerce.services;

import az.edu.itbrains.ecommerce.dtos.product.ProductDetailDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductHomeDto;

import java.util.List;

public interface ProductService {

    List<ProductHomeDto> getAllHomeProducts();

    ProductDetailDto getProductDetail(Long id);
}
