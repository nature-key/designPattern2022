package 迭代器模式;

public class Product {

    private String productName;

    private String productCode;

    public Product(String productName, String productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "迭代器模式.Product{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}
