package pl.javkob.shop.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.javkob.shop.admin.model.AdminProduct;
import pl.javkob.shop.admin.repository.AdminProductRepository;

@Service
@RequiredArgsConstructor
public class AdminProductService {

    private final AdminProductRepository productRepository;
    public Page<AdminProduct> getProducts(Pageable pagable){
        return productRepository.findAll(pagable);
    }
}
