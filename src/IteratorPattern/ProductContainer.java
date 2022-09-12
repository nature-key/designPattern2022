package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ProductContainer implements Container {


    private List<Product> productList = new ArrayList<>();

    private int size;


    public void addProduct(Product product) {
        productList.add(product);
        size = productList.size();
    }

    public Product getProduct(int index) {
        return productList.get(index);
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this);
    }
}
