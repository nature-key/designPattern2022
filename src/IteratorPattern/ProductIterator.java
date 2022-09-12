package IteratorPattern;

public class ProductIterator implements Iterator {
    private ProductContainer productContainer;
    private int index;

    public ProductIterator(ProductContainer productContainer) {
        this.productContainer = productContainer;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if (index < productContainer.getSize()) {
            return true;
        }
        return false;
    }
    @Override
    public Object next() {
        if (hasNext()) {
            return productContainer.getProduct(index++);
        }
        return null;
    }
}
