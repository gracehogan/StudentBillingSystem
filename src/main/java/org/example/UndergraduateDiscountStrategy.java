package org.example;

public class UndergraduateDiscountStrategy implements GPADiscountStrategy{
    @Override
    public double calculateGPADiscount(Student student) {
        double currentFee=0;
        if (student.getGPA() >= 3.5)
        {
            currentFee=student.getCurrentFee()*0.9;
        }
        return currentFee;
    }
}
