package com.alvaromerinogarcia.codechallenge.domain.taxes;

import com.alvaromerinogarcia.codechallenge.domain.items.Item;
import com.alvaromerinogarcia.codechallenge.domain.items.RealItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BasicSalesTaxTest {

    @Test
    public void testGetFinalPrice_ShouldIncreaseTenPercentOfPrice() {
        Item item = new RealItem("TestedItem", new BigDecimal(200.00));
        Assertions.assertTrue(Math.abs((item.getFinalPrice().subtract(new BigDecimal(200.00)).doubleValue())) == 0.0);

        item = new BasicSalesTax(item);
        Assertions.assertTrue(Math.abs((item.getFinalPrice().subtract(new BigDecimal(220.00)).doubleValue())) == 0.0);
    }

}
