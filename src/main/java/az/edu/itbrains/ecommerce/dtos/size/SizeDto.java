package az.edu.itbrains.ecommerce.dtos.size;

import az.edu.itbrains.ecommerce.model.Color;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SizeDto {
    private Long id;
    private String size;
    private int quantity;

    @ManyToOne
    private Color color;

}
