package az.edu.itbrains.ecommerce.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1000)
    private String description;
    private double price;
    private double discount;
    private String shortDescription;
    private String barcode;

    public Product(String barcode, Category category, String description, double discount,
                   double price, String shortDescription) {
        this.barcode = barcode;
        this.category = category;
        this.description = description;
        this.discount = discount;
        this.price = price;
        this.shortDescription = shortDescription;
    }

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Color> colors = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<Photo> photos = new ArrayList<>();

}
