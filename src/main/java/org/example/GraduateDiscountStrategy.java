package org.example;

public class GraduateDiscountStrategy implements GPADiscountStrategy{

    @Override
    public double calculateGPADiscount(Student student, double currentFee) {
        if (student.getGPA() >= 3.0)
        {
            currentFee = (currentFee*0.8);
        }
        return currentFee;
    }
}
