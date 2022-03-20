package blog.developia.converter.controller;

import blog.developia.converter.dto.CreateProductDto;
import blog.developia.converter.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String getProduct(@RequestBody CreateProductDto dto) {
        log.info("ProductStatus = {}", dto.getProductStatus());
        log.info("ProductName = {}", dto.getProductName());
        log.info("Count = {}", dto.getCount());
        log.info("Price = {}", dto.getPrice());

        return "success";
    }

    @PostMapping
    public String createProduct(@RequestBody CreateProductDto dto) {
        log.info("ProductStatus = {}", dto.getProductStatus());
        log.info("ProductName = {}", dto.getProductName());
        log.info("Count = {}", dto.getCount());
        log.info("Price = {}", dto.getPrice());
        productService.createProduct(dto);
        return "success";
    }

}
