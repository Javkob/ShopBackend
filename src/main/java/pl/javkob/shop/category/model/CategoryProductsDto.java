package pl.javkob.shop.category.model;

import org.springframework.data.domain.Page;
import pl.javkob.shop.product.model.Product;

public record CategoryProductsDto(Category category, Page<Product> products) {
}
