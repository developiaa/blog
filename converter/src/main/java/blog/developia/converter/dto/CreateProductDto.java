package blog.developia.converter.dto;

import blog.developia.converter.enums.ProductStatus;
import lombok.Data;

@Data
public class CreateProductDto {
    private ProductStatus productStatus;

    private String productName;

    private Integer count;

    private Integer price;

}
