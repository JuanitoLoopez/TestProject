package discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void should_return_total_zero_when_there_are_not_prices() {

        PriceCalculator calculator = new PriceCalculator();

        assertEquals(0, PriceCalculator.getTotal(), 0);
    }

    @Test
    public void should_return_sum_total_when_there_are_prices() {

        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrices(10.2);
        calculator.addPrices(22.3);

        assertEquals(32.5, PriceCalculator.getTotal(), 0);
    }
}