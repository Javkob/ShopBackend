package pl.javkob.shop.admin.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.javkob.shop.admin.product.model.AdminProduct;
import pl.javkob.shop.admin.product.repository.AdminProductRepository;

@Service
@RequiredArgsConstructor
public class AdminProductService {

    private final AdminProductRepository productRepository;

    public Page<AdminProduct> getProducts(Pageable pagable) {
        return productRepository.findAll(pagable);
    }

    public AdminProduct getProduct(Long id) {
        return  productRepository.findById(id).orElseThrow();
    }

    public AdminProduct createProduct(AdminProduct product) {
        return productRepository.save(product);
    }

    public AdminProduct updateProduct(AdminProduct product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
