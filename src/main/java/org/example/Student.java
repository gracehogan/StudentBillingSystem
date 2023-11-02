package org.example;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;

public abstract class Student {

    List<Course> courses = new ArrayList<>();

    public final double getCurrentFee(){

       double feePreDiscount = calculateTotalCourseCostPreDiscount();
       double currentFee = applyDiscount(feePreDiscount);
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

}
