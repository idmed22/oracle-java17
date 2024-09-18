package org.example.optional;

import org.example.data.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) implements Product {

    public BigDecimal discount() {
        return BigDecimal.TEN;
    }
}
