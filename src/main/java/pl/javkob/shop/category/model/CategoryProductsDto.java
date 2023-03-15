package pl.javkob.shop.category.model;

import org.springframework.data.domain.Page;
import pl.javkob.shop.product.controller.dto.ProductListDTO;

public record CategoryProductsDto(Category category, Page<ProductListDTO> products) {
}
