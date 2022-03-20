package blog.developia.converter.service;

import blog.developia.converter.dto.CreateProductDto;
import blog.developia.converter.entity.Product;
import blog.developia.converter.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(CreateProductDto dto) {
        Product product = Product.builder()
                .status(dto.getProductStatus())
                .name(dto.getProductName())
                .count(dto.getCount())
                .price(dto.getPrice())
                .build();

        productRepository.save(product);
    }
}
