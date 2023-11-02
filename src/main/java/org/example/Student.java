package org.example;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;

public abstract class Student {

    double GPA;
    GPADiscountStrategy gpaDiscountStrategy;
    List<Course> courses = new ArrayList<>();


    public void setGpaDiscountStrategy(GPADiscountStrategy gpaDiscountStrategy) {
        this.gpaDiscountStrategy = gpaDiscountStrategy;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    public final double getCurrentFee(){

       double feePreDiscount = calculateTotalCourseCostPreDiscount();

       double currentFee = applyDiscount(feePreDiscount);

       currentFee = applyGPADiscount(this.gpaDiscountStrategy, currentFee);

       return currentFee;
    }
    protected double calculateTotalCourseCostPreDiscount(){
        double totalCost=0;

        for (Course c: courses){
            totalCost += (c.getHours()*c.getCourseRate());
        }
        return totalCost;
    }
    protected abstract double applyDiscount(double feePreDiscount);

    protected double applyGPADiscount (GPADiscountStrategy gpaDiscountStrategy, double currentFee){
     return gpaDiscountStrategy.calculateGPADiscount(this, currentFee);
    }


}
