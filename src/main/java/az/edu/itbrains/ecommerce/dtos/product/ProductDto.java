package az.edu.itbrains.ecommerce.dtos.product;

import az.edu.itbrains.ecommerce.model.Category;
import az.edu.itbrains.ecommerce.model.Color;
import az.edu.itbrains.ecommerce.model.Photo;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;

    private String description;
    private double price;
    private double discount;
    private String shortDescription;
    private String barcode;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Color> colors = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<Photo> photos = new ArrayList<>();
}
