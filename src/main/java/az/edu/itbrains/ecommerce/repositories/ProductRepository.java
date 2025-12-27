package az.edu.itbrains.ecommerce.repositories;

import az.edu.itbrains.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //    @Query(nativeQuery = true,value = "SELECT * FROM product WHERE name LIKE %?1%")
//    @Query("select p from Product p where p.name like %?1%")
//    Product findByBarcode(String barcode);
    List<Product> findTop8ByOrderByIdDesc();

    List<Product> findTop3ByHotTrendingTrueOrderByIdDesc();

    List<Product> findTop3ByFeaturedTrueOrderByIdDesc();

}
