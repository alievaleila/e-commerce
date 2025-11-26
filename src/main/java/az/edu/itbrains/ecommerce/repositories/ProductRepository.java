package az.edu.itbrains.ecommerce.repositories;

import az.edu.itbrains.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product,Long> {
//    @Query(nativeQuery = true,value = "SELECT * FROM product WHERE name LIKE %?1%")
//    @Query("select p from Product p where p.name like %?1%")
    Product findByBarcode(String barcode);



}
