package org.example.optional;

import java.math.BigDecimal;

public sealed interface Product permits Drink, Food, Souvenir {
    String name();
    BigDecimal discount();
}
