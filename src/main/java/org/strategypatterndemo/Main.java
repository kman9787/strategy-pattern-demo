package org.strategypatterndemo;

import java.math.BigDecimal;

public class Main {



    public static void main(String[] args) {
        System.out.println("*** Strategy Pattern Demo ***");

        SaleItem item = new SaleItem(BigDecimal.valueOf(1000));
        System.out.println("*** Sales Amount: " + item.getAmount());

        // MN SalesTax
        item.applySalesTax(new SalesTaxMNImpl()::computeSalesTax);
        System.out.println("*** MN Sales Tax: " + item.getAmountAfterSalesTax());

        // CA SalesTax
        item.applySalesTax(new SalesTaxCAImpl()::computeSalesTax);
        System.out.println("*** CA Sales Tax: " + item.getAmountAfterSalesTax());

        // NY SalesTax
        item.applySalesTax(new SalesTaxNYImpl()::computeSalesTax);
        System.out.println("*** NY Sales Tax: " + item.getAmountAfterSalesTax());

        // NM SalesTax
        item.applySalesTax(new SalesTaxNMImpl()::computeSalesTax);
        System.out.println("*** NM Sales Tax: " + item.getAmountAfterSalesTax());

        // TX SalesTax
        item.applySalesTax(new SalesTaxTXImpl()::computeSalesTax);
        System.out.println("*** TX Sales Tax: " + item.getAmountAfterSalesTax());



    }
}