package taehub.product.services;

import org.springframework.stereotype.Service;
import taehub.product.models.Cart;
import taehub.product.models.Discount;

@Service
public class ProductService {
    private Cart cart;

    public ProductService() {
    }

    public ProductService(Cart cart) {
        this.cart = cart;
    }

    public double calculateTotalPrice(Discount discount) {
        if (cart == null) {
            return 0.00;
        }
        if (discount == null){
            return calculateTotalPrice();
        }
        double totalPrice = cart.getTotalPrice();
        double discountValue = totalPrice * discount.getDiscountValue();
        return totalPrice - discountValue;
    }

    public double calculateTotalPrice() {
        if (cart == null) {
            return 0.00;
        }
        return cart.getTotalPrice();
    }
}
