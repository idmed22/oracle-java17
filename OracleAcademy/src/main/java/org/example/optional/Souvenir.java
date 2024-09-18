package org.example.optional;

import org.example.data.Rating;

import java.math.BigDecimal;

public sealed class Souvenir implements Product permits CollectableItem{
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;
    private String size;

    public Souvenir(int id, String name, BigDecimal price, Rating rating, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.size = size;
    }

    @Override
    public String name() {
        return name;
    }
    @Override
    public BigDecimal discount() {
        return BigDecimal.valueOf(3);
    }
}
