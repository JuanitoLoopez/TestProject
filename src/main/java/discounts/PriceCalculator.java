package discounts;

import java.util.LinkedList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new LinkedList<>();
    private double discount = 0.0;

    public double getTotal() {

        double result = 0;

        for (Double price : prices) {
            result += price;
        }
        
        return result * ( (100 - discount) / 100);
    }

    public void addPrices(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
