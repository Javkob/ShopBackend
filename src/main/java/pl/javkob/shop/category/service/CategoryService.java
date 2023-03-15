package pl.javkob.shop.category.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.javkob.shop.category.model.Category;
import pl.javkob.shop.category.model.CategoryProductsDto;
import pl.javkob.shop.category.repository.CategoryRepository;
import pl.javkob.shop.product.controller.dto.ProductListDTO;
import pl.javkob.shop.product.model.Product;
import pl.javkob.shop.product.repository.ProductRepository;


import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }


    @Transactional(readOnly = true)
    public CategoryProductsDto getCategoriesWithProducts(String slug, Pageable pageable) {
        Category category = categoryRepository.findBySlug(slug);
        Page<Product> page = productRepository.findByCategoryId(category.getId(), pageable);
        List<ProductListDTO> productListDTOS = page.getContent().stream()
                .map(product -> ProductListDTO.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .description(product.getDescription())
                        .price(product.getPrice())
                        .currency(product.getCurrency())
                        .image(product.getImage())
                        .slug(product.getSlug())
                        .build())
                .toList();
        return new CategoryProductsDto(category, new PageImpl<>(productListDTOS, pageable, page.getTotalElements()));
    }
}
