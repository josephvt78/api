package net.josephvt.pokemonreview.api.service;

import net.josephvt.pokemonreview.api.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    ReviewDto createReview(int pokemonId, ReviewDto reviewDto);
    List<ReviewDto> getReviewsByPokemonId(int id);

    ReviewDto getReviewById(int reviewId, int pokemonId);

    ReviewDto updateReview(ReviewDto reviewDto, int reviewId, int pokemonId);
    void deleteReviewById(int reviewId, int pokemonId);
}
