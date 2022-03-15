package blog.developia.converter.controller;

import blog.developia.converter.dto.CreateProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    @PostMapping("/")
    public String createProduct(@RequestBody CreateProductDto dto) {
        log.info("ProductStatus = {}", dto.getProductStatus());
        log.info("ProductName = {}", dto.getProductName());
        log.info("Count = {}", dto.getCount());
        log.info("Price = {}", dto.getPrice());

        return "success";
    }

}
