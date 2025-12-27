package az.edu.itbrains.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @Column(columnDefinition = "boolean default false")
    private boolean featured;

    @Column(columnDefinition = "boolean default false")
    private boolean hotTrending;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<ColorSize> colorSizes = new ArrayList<>();


    @OneToMany(mappedBy = "product")
    private List<Photo> photos = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems = new ArrayList<>();

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
