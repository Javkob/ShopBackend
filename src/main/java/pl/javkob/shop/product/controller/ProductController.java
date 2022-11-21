package pl.javkob.shop.product.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.javkob.shop.product.model.Product;
import pl.javkob.shop.product.service.ProductService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}
