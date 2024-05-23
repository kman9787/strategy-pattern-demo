package org.strategypatterndemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class SalesTaxTest {

    SaleItem saleItem;

    @BeforeEach
    void setUp() {
        saleItem = new SaleItem(BigDecimal.valueOf(1000));
    }

    @Test
    void testMNSalesTax() {
        double afterSalesTax = saleItem.applySalesTax(new SalesTaxMNImpl()::computeSalesTax).doubleValue();
        double expectedSalesTax = saleItem.getAmount().multiply(BigDecimal.valueOf(0.0678)).doubleValue();

        assertEquals(afterSalesTax, expectedSalesTax);
    }

    @Test
    void testCASalesTax() {
        double afterSalesTax = saleItem.applySalesTax(new SalesTaxCAImpl()::computeSalesTax).doubleValue();
        double expectedSalesTax = saleItem.getAmount().multiply(BigDecimal.valueOf(0.065)).doubleValue();

        assertEquals(afterSalesTax, expectedSalesTax);
    }

    @Test
    void testNYSalesTax() {
        double afterSalesTax = saleItem.applySalesTax(new SalesTaxNYImpl()::computeSalesTax).doubleValue();
        double expectedSalesTax = saleItem.getAmount().multiply(BigDecimal.valueOf(0.04)).doubleValue();

        assertEquals(afterSalesTax, expectedSalesTax);
    }

    @Test
    void testNMSalesTax() {
        double afterSalesTax = saleItem.applySalesTax(new SalesTaxNMImpl()::computeSalesTax).doubleValue();
        double expectedSalesTax = saleItem.getAmount().multiply(BigDecimal.valueOf(0.05125)).doubleValue();

        assertEquals(afterSalesTax, expectedSalesTax);
    }

    @Test
    void testTXSalesTax() {
        double afterSalesTax = saleItem.applySalesTax(new SalesTaxTXImpl()::computeSalesTax).doubleValue();
        double expectedSalesTax = saleItem.getAmount().multiply(BigDecimal.valueOf(0.0625)).doubleValue();

        assertEquals(afterSalesTax, expectedSalesTax);
    }

}
