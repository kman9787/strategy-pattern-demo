package org.strategypatterndemo;

import java.math.BigDecimal;

public class SalesTaxNYImpl implements SalesTax {

    public static final double SALES_TAX_PERCENT = 0.04;

    @Override
    public BigDecimal computeSalesTax(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(SALES_TAX_PERCENT));
    }
}
