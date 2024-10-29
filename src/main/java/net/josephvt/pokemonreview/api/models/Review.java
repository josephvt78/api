package net.josephvt.pokemonreview.api.models;

import lombok.Data;

@Data
public class Review {
    private int id;
    private String title;
    private String content;
    private int start;
}
