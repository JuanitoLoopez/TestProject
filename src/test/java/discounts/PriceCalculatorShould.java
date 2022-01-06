package discounts;

import org.junit.Test;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void should_return_total_zero_when_there_are_not_prices() {

        PriceCalculator calculator = new PriceCalculator();

        assertEquals(0, calculator.getTotal(), 0);
    }

    @Test
    public void should_return_sum_total_when_there_are_prices() {

        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices(10.2);
        calculator.addPrices(22.3);

        assertEquals(32.5, calculator.getTotal(), 0);
    }

    @Test
    public void apply_discount_to_prices() {

        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices(15.0);
        calculator.addPrices(35.0);

        calculator.setDiscount(50);

        assertEquals(25.0, calculator.getTotal(), 0);
    }

    @Test
    public void apply_discount_to_prices_different_discount() {

        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices(100.0);
        calculator.addPrices(100.0);

        calculator.setDiscount(25);

        assertEquals(150, calculator.getTotal(), 0);
    }
}