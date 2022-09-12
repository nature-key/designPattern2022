package IteratorPattern;

public class Main {

    public static void main(String[] args) {

        ProductContainer productContainer = new ProductContainer();

        productContainer.addProduct(new Product("洁癖", "jiepi"));
        productContainer.addProduct(new Product("洁癖2", "jiepi2"));


        Iterator iterator = productContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
