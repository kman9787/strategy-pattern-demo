package org.strategypatterndemo;

import java.math.BigDecimal;
import java.util.function.Function;

public class SaleItem {

    private BigDecimal amount;

    private BigDecimal amountAfterSalesTax = BigDecimal.ZERO;

    public SaleItem(BigDecimal amount){
        this.amount = amount;
    }

    public BigDecimal applySalesTax(Function<BigDecimal, BigDecimal> computeSalesTax){
        this.amountAfterSalesTax =  computeSalesTax.apply(amount);
        return this.amountAfterSalesTax;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getAmountAfterSalesTax() {
        return amountAfterSalesTax;
    }
}
