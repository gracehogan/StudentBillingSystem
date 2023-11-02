package org.example;

public class GraduateDiscountStrategy implements GPADiscountStrategy{

    @Override
    public double calculateGPADiscount(Student student) {
        double currentFee=0;
        if (student.getGPA() >= 3.0)
        {
            currentFee=student.getCurrentFee()*0.8;
        }
        return currentFee;
    }
}
