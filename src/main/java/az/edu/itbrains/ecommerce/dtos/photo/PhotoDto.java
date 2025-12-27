package az.edu.itbrains.ecommerce.dtos.photo;

import az.edu.itbrains.ecommerce.model.Product;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhotoDto {

    private Long id;
    private String url;
    private Boolean selected;

    @ManyToOne
    private Product product;
}
