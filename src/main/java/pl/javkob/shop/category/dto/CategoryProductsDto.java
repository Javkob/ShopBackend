package pl.javkob.shop.category.dto;

import org.springframework.data.domain.Page;
import pl.javkob.shop.common.model.Category;
import pl.javkob.shop.common.dto.ProductListDTO;

public record CategoryProductsDto(Category category, Page<ProductListDTO> products) {
}
