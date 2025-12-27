package az.edu.itbrains.ecommerce.services;

import az.edu.itbrains.ecommerce.dtos.product.ProductBestSellerDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductCreateDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductDashboardDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductDetailDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductFeaturedDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductHomeDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductHotTrendDto;
import az.edu.itbrains.ecommerce.model.Product;
import az.edu.itbrains.ecommerce.payloads.results.Result;

import java.util.List;

public interface ProductService {

    List<ProductHomeDto> getAllHomeProducts();

    ProductDetailDto getProductDetail(Long id);

    Result createProduct(ProductCreateDto productCreateDto);

    List<ProductDashboardDto> getDashboardProducts();

    List<ProductFeaturedDto> getFeaturedProducts();

    List<ProductHotTrendDto> getHotTrendProducts();

    List<ProductBestSellerDto> getBestSellerProducts();

    Product getProductById(Long productId);
}
