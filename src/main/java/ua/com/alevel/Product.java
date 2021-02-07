package ua.com.alevel;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal price;
    Category category;

    public Product(String name, BigDecimal price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product " + name +
                ", price = " + price + ", " + category;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return this.price = price;
    }

    public Category getCategory() {
        return this.category = category;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
