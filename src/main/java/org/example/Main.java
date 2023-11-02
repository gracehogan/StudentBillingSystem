package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student undergrad = new Undergraduate();
        Student grad =  new Graduate();
        Student faculty = new Faculty(true);

        List<Course> courses = new ArrayList<>();

        courses.add(new Course(1000, 30));
        courses.add(new Course(500, 20));
        courses.add(new Course(300, 10));

        grad.setCourses(courses);
        grad.setGpaDiscountStrategy(new GraduateDiscountStrategy());
        grad.setGPA(3.8);
        grad.getCurrentFee();

    }
}