package az.edu.itbrains.ecommerce.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double price;
    private String shortDescription;

    @OneToMany
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Color> colors = new ArrayList<>();
}
