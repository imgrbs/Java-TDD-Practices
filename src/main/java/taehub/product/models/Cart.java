package taehub.product.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> productList;

    public Cart() {
        productList = new ArrayList<Product>();
    }

    public Cart(Product product) {
        productList = new ArrayList<Product>();
        productList.add(product);
    }


    public Cart(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : this.productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
