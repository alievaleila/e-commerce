package az.edu.itbrains.ecommerce.dtos.product;

import az.edu.itbrains.ecommerce.dtos.color.ColorDto;
import az.edu.itbrains.ecommerce.dtos.photo.PhotoDto;
import az.edu.itbrains.ecommerce.model.Category;
import az.edu.itbrains.ecommerce.model.Color;
import az.edu.itbrains.ecommerce.model.Photo;
import jakarta.persistence.Column;
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
public class ProductCreateDto {
    private String name;
    @Column(length = 1000)
    private String description;
    private double price;
    private double discount;
    private String shortDescription;
    private String specification;
    private String barcode;


    private Long categoryId;

    private List<ColorDto> colors = new ArrayList<>();

    private List<PhotoDto> photos = new ArrayList<>();
}
