package org.strategypatterndemo;

import java.math.BigDecimal;

public class SalesTaxMNImpl implements SalesTax {

    public static final double SALES_TAX_PERCENT = 0.0678;

    @Override
    public BigDecimal computeSalesTax(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(SALES_TAX_PERCENT));
    }
}
