package org.example;

public class Faculty extends Student{

    private static final double DISCOUNT_RATE =0.1;
    private static final double TENURE_DISCOUNT_RATE =0.1;

    private boolean isTenured;

    public Faculty(boolean isTenured) {
        this.isTenured = isTenured;
    }

    @Override
    protected double applyDiscount(double feePreDiscount) {
        double currentFee = feePreDiscount - (feePreDiscount* DISCOUNT_RATE);
        if (isTenured){
            currentFee -= (currentFee* TENURE_DISCOUNT_RATE);
        }
        return currentFee;
    }


}
