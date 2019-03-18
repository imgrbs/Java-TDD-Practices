package taehub.product.services;

import org.springframework.stereotype.Service;
import taehub.product.models.Cart;
import taehub.product.models.Discount;

@Service
public class ProductService {

    Cart cart;

    public ProductService() {
    }

    public ProductService(Cart cart) {
        this.cart = cart;
    }

    public double calculateTotalPrice(Discount discount) {
        if (cart != null) {
            double totalPrice = cart.getTotalPrice();
            double discountValue = totalPrice * discount.getDiscountValue();
            totalPrice -= discountValue;
            return totalPrice;
        }
        return 0.00;
    }


    public double calculateTotalPrice() {
        if (cart != null) {
            return cart.getTotalPrice();
        }
        return 0.00;
    }
}
