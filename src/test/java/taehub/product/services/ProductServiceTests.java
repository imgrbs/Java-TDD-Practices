package taehub.product.services;

import org.junit.Assert;

import org.junit.Test;
import taehub.product.models.Cart;
import taehub.product.models.Discount;
import taehub.product.models.Product;


public class ProductServiceTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCalculateTotalPriceWithNoItemShouldReturn0() {
        ProductService productService = new ProductService();

        double totalPrice = productService.calculateTotalPrice();

        Assert.assertEquals(totalPrice, 0.00, 0.00);
    }

    @Test
    public void testCalculateTotalPriceWith1ItemShouldReturn10() {
        Cart cart = new Cart(new Product("Chocolate", 10.00));
        ProductService productService = new ProductService(cart);

        double totalPrice = productService.calculateTotalPrice();

        Assert.assertEquals(totalPrice, 10.00, 0.00);
    }

    @Test
    public void testCalculateTotalPriceWith2ItemShouldReturn50() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Chocolate", 10.00));
        cart.addProduct(new Product("Pocky", 40.00));
        ProductService productService = new ProductService(cart);

        double totalPrice = productService.calculateTotalPrice();

        Assert.assertEquals(totalPrice, 50.00, 0.00);
    }

    @Test
    public void testCalculateTotalPriceWith2ItemAndDiscount10PercentShouldReturn45() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Chocolate", 10.00));
        cart.addProduct(new Product("Pocky", 40.00));
        ProductService productService = new ProductService(cart);
        Discount discount = new Discount("10% couple", 0.1);

        double totalPrice = productService.calculateTotalPrice(discount);

        Assert.assertEquals(totalPrice, 45.00, 0.00);
    }

    @Test
    public void testCalculateTotalPriceWith3ItemAndDiscount20PercentShouldReturn72() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Chocolate", 10.00));
        cart.addProduct(new Product("Pocky", 40.00));
        cart.addProduct(new Product("Thai Tea", 40.00));
        ProductService productService = new ProductService(cart);
        Discount discount = new Discount("20% couple", 0.2);

        double totalPrice = productService.calculateTotalPrice(discount);

        Assert.assertEquals(totalPrice, 72.00, 0.00);
    }

    @Test
    public void testCalculateTotalPriceWithNullCartAndDiscount10Percent() {
        ProductService productService = new ProductService(null);
        Discount discount = new Discount("10% couple", 0.1);

        double totalPrice = productService.calculateTotalPrice(discount);

        Assert.assertEquals(totalPrice, 0.00, 0.00);
    }

    @Test
    public void testCalculateTotalPriceWith2ItemsCartAndNullDiscount() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Chocolate", 10.00));
        cart.addProduct(new Product("Pocky", 40.00));
        ProductService productService = new ProductService(cart);

        double totalPrice = productService.calculateTotalPrice(null);

        Assert.assertEquals(totalPrice, 50.00, 0.00);
    }
}
