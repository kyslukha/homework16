package ua.com.alevel;

import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        TreeSet<Product> productsComparator = new TreeSet<>(new ProductComparator());
// commit
        Category categoryMilk = new Category("Milk", 1l);
        Category categoryMeat = new Category("Meat", 2l);
        Category categoryFish = new Category("Fish", 3l);
        Category categoryFruits = new Category("Fruits", 4l);
        Category categoryBirds = new Category("Birds", 5l);
// new comment
        Product cheese = new Product("Cheese", new BigDecimal("405.14"), categoryMilk);
        Product chicken = new Product("Chicken", new BigDecimal("80.84"), categoryBirds);
        Product beef = new Product("Beef", new BigDecimal("547.25"), categoryMeat);
        Product yogurt = new Product("Yogurt", new BigDecimal("20.17"), categoryMilk);
        Product perch = new Product("Perch", new BigDecimal("240.19"), categoryFish);
        Product apple = new Product("Apple", new BigDecimal("20.89"), categoryFruits);
        Product pork = new Product("Pork", new BigDecimal("435.89"), categoryMeat);
        Product lemon = new Product("Lemon", new BigDecimal("85.14"), categoryFruits);
        Product salmon = new Product("Salmon", new BigDecimal("310.14"), categoryFish);
        Product turkey = new Product("Turkey", new BigDecimal("120.14"), categoryBirds);

        products.add(cheese);
        products.add(apple);
        products.add(beef);
        products.add(perch);
        products.add(yogurt);
        products.add(salmon);
        products.add(lemon);
        products.add(chicken);
        products.add(turkey);
        products.add(pork);
        for (Product product : products) {
            productsComparator.add(product);
            System.out.println(product);
        }
        System.out.println("*********************************");
        for (Product temp : productsComparator) {
            System.out.println(temp);
        }
        bubbleSort(products);
    }

    public static void bubbleSort(ArrayList<Product> sort) {
        int numberProducts = sort.size();
        for (int i = 0; i < numberProducts - 1; i++) {
            for (int j = 0; j < numberProducts - i - 1; j++) {
                if (comparatorID(sort.get(j), sort.get(j + 1)) > 0) {
                    Product temp = sort.get(j);
                    sort.set(j, sort.get(j + 1));
                    sort.set(j + 1, temp);
                } else {
                    if ((comparatorID(sort.get(j), sort.get(j + 1)) == 0) && (comparatorPrice(sort.get(j), sort.get(j + 1)) > 0)) {
                        Product temp = sort.get(j);
                        sort.set(j, sort.get(j + 1));
                        sort.set(j + 1, temp);
                    }
                }
            }
        }
        System.out.println("*********************************");
        for (Product temp : sort) {
            System.out.println(temp);
        }
    }

    public static int comparatorID(Product first, Product second) {
        return (int) (first.getCategory().getCategoryId() - second.getCategory().categoryId);
    }

    public static int comparatorPrice(Product first, Product second) {
        return first.getPrice().compareTo(second.getPrice());
    }
}