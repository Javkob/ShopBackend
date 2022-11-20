package pl.javkob.shop.product.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.javkob.shop.product.model.Product;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getproducts() {
        return List.of(
                new Product( "Nowy produkt 1","Nowa Kategora 1", "Nowy opis 1", new BigDecimal("8.99"), "PLN"),
                new Product( "Nowy produkt 2","Nowa Kategora 2", "Nowy opis 2", new BigDecimal("8.99"), "PLN"),
                new Product( "Nowy produkt 3","Nowa Kategora 3", "Nowy opis 3", new BigDecimal("8.99"), "PLN"),
                new Product( "Nowy produkt 4","Nowa Kategora 4", "Nowy opis 4", new BigDecimal("8.99"), "PLN")
        );
    }

}
