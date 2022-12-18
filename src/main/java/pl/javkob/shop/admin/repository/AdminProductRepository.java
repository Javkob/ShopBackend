package pl.javkob.shop.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javkob.shop.admin.model.AdminProduct;

public interface AdminProductRepository extends JpaRepository<AdminProduct,Long> {

}
