package pl.javkob.shop.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javkob.shop.common.model.Review;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
