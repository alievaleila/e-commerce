package az.edu.itbrains.ecommerce.dtos.product;

import az.edu.itbrains.ecommerce.dtos.category.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDashboardDto {

    private Long id;
    private String name;
    private String image;
    private Double price;
    private Double discount;
    private CategoryDto category;
}
