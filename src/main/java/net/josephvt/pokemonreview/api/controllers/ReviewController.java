package net.josephvt.pokemonreview.api.controllers;

import net.josephvt.pokemonreview.api.dto.ReviewDto;
import net.josephvt.pokemonreview.api.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ReviewController {

    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("pokemon/{pokemonId}/review")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ReviewDto> createReview(@PathVariable(name="pokemonId") int pokemonId, @RequestBody ReviewDto reviewDto) {
        return new ResponseEntity<>(reviewService.createReview(pokemonId, reviewDto), HttpStatus.CREATED);
    }

    @GetMapping("/pokemon/{pokemonId}/reviews")
    public ResponseEntity<List<ReviewDto>> getReviewsByPokemonId(@PathVariable(value = "pokemonId") int pokemonId) {
        return ResponseEntity.ok(reviewService.getReviewsByPokemonId(pokemonId));
    }
}
