package org.example;

public class Graduate extends Student {
    private static final double DISCOUNT_RATE = 0.3;

    @Override
    protected double applyDiscount(double feePreDiscount) {
        double currentFee = feePreDiscount - (feePreDiscount * DISCOUNT_RATE);

        return currentFee;
    }


}
