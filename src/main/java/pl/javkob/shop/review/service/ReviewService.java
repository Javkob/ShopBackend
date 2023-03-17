package pl.javkob.shop.review.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.javkob.shop.common.model.Review;
import pl.javkob.shop.common.repository.ReviewRepository;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public Review addReview (Review review){
        return reviewRepository.save(review);
    }
}
