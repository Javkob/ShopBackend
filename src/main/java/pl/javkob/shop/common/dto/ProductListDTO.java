package pl.javkob.shop.common.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class ProductListDTO {

    private Long id;
    private String name;
    private Long categoryId;
    private String description;
    private BigDecimal price;
    private String currency;
    private String image;
    private String slug;
}
