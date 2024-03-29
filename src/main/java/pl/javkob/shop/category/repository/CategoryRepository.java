package pl.javkob.shop.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javkob.shop.common.model.Category;


public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findBySlug(String slug);
}
