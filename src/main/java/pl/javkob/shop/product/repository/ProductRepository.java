package pl.javkob.shop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javkob.shop.product.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
