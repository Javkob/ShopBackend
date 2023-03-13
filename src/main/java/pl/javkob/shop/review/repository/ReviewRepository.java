package pl.javkob.shop.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javkob.shop.review.model.Review;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
