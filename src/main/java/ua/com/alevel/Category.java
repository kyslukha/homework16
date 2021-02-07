package ua.com.alevel;

public class Category {
    String name;
    Long categoryId;

    public Category(String name, Long categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Category "
                + name + ", id = "
                + categoryId;
    }

    public String getName() {
        return name;
    }

    public Long getCategoryId() {
        return categoryId;
    }
}
