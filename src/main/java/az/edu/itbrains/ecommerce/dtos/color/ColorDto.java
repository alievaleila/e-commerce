package az.edu.itbrains.ecommerce.dtos.color;

import az.edu.itbrains.ecommerce.dtos.size.SizeDto;
import az.edu.itbrains.ecommerce.model.Product;
import az.edu.itbrains.ecommerce.model.Size;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColorDto {
    private Long id;
    private String name;
    private List<SizeDto> sizes;
}

