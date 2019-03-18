package taehub.product.models;

public class Discount {
    private String name;
    private double discountValue;

    public Discount(String name, double discountValue) {
        this.name = name;
        this.discountValue = discountValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }
}
