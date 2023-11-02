package org.example;

public class NoGPADiscountStrategy implements GPADiscountStrategy {
    @Override
    public double calculateGPADiscount(Student student, double currentFee) {
        return currentFee;
    }
}
