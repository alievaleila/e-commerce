package az.edu.itbrains.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "color")
    private List<Size> sizes = new ArrayList<>();

    @ManyToOne
    private Product product;
}
