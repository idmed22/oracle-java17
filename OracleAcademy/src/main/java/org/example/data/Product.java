package org.example.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;


public sealed class Product implements Rateable<Product> permits Drink, Food{
    private int id;
    private String name;
    private BigDecimal price;
    public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);
    private  Rating rating;

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }
    public Product() {
        this(0,"no name", BigDecimal.ZERO);
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }
    public Rating getRating() {
        return rating;
    }
    public Product applyRating(Rating newRating) {
        return new Product(getId(),getName(),getPrice(),
                newRating);
    }

    @Override
    public String toString() {
        return  id+", "+name+", "+price+", "
                +getDiscount()+", "+rating.getStars()+
                " "+getBestBefore();
    }

    public LocalDate getBestBefore(){
        return LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Product product) {
        return id == product.id;
    }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
