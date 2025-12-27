package az.edu.itbrains.ecommerce.dtos.product;

import az.edu.itbrains.ecommerce.dtos.color.ColorDto;
import az.edu.itbrains.ecommerce.dtos.colorsize.ColorSizeCreateDto;
import az.edu.itbrains.ecommerce.dtos.photo.PhotoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDto {

    //    @Size(min = 5, max = 50, message = "Name must be at least 5 characters and at most 50 characters.")
    private String name;

    //    @Column(length = 1000)
    private String description;

    //    @NumberFormat
    private Double price;

    private Double discount;
    private String shortDescription;
    private String specification;

    //    @Size(min = 8, max = 8)
    private String barcode;

    //    @NotBlank(message = "Category can not be null")
    private Long categoryId;

    private List<ColorDto> colors = new ArrayList<>();

    private List<PhotoDto> photos = new ArrayList<>();

    private List<ColorSizeCreateDto> colorSizes = new ArrayList<>();
}
