package org.example;

public class UndergraduateDiscountStrategy implements GPADiscountStrategy{
    @Override
    public double calculateGPADiscount(Student student, double currentFee) {;
        if (student.getGPA() >= 3.5)
        {
            currentFee = (currentFee*0.9);
        }
        return currentFee;
    }
}
