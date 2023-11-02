package org.example;

public class Undergraduate extends Student {

    @Override
    protected double applyDiscount(double feePreDiscount) {
        return feePreDiscount;
    }
}
