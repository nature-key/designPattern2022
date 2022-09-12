package IteratorPattern;

public class Product {

    private String productName;

    private String productCode;

    public Product(String productName, String productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "IteratorPattern.Product{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}