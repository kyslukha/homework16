package ua.com.alevel;


import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product leftProduct, Product rightProduct) {
        if ((leftProduct.getCategory().categoryId - rightProduct.getCategory().categoryId) != 0) {
            return (int) (leftProduct.getCategory().categoryId - rightProduct.getCategory().categoryId);
        } else {
            return rightProduct.getPrice().compareTo(leftProduct.getPrice());
        }
    }
}

