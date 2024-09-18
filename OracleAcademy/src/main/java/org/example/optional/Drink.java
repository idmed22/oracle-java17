package org.example.optional;

import org.example.data.Rating;
import java.math.BigDecimal;

public record Drink(int id, String name, BigDecimal price, Rating rating) implements Product {
    @Override
    public BigDecimal discount() {
        return BigDecimal.valueOf(5);
    }
}
