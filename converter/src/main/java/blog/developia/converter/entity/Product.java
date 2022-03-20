package blog.developia.converter.entity;

import blog.developia.converter.enums.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer count;

    private Integer price;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @Builder
    public Product(String name, Integer count, Integer price, ProductStatus status) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.status = status;
    }
}
