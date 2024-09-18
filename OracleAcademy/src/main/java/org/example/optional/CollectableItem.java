package org.example.optional;

import org.example.data.Rating;

import java.math.BigDecimal;

public non-sealed class CollectableItem extends Souvenir{
    public CollectableItem(int id, String name, BigDecimal price,
                           Rating rating, String size) {
        super(id, name, price, rating, size);
    }

    @Override
    public BigDecimal discount() {
        return BigDecimal.valueOf(15);
    }
}
