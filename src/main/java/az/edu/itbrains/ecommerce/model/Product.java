package az.edu.itbrains.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 1000)
    private String description;
    private double price;
    private double discount;
    private String shortDescription;
    private String specification;
    private String barcode;

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<Color>colors=new ArrayList<>();


    @OneToMany(mappedBy = "product")
    private List<Photo> photos = new ArrayList<>();

    public Product(String barcode, Category category, String description, double discount,
                   double price, String shortDescription) {
        this.barcode = barcode;
        this.category = category;
        this.description = description;
        this.discount = discount;
        this.price = price;
        this.shortDescription = shortDescription;
    }


}
