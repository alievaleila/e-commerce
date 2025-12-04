package az.edu.itbrains.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String size;
    private int quantity;

    @ManyToOne
    private Color color;


}
