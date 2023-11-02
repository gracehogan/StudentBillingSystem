package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student undergrad = new Undergraduate();
        Student grad =  new Graduate();
        Student faculty = new Faculty(true);

        List<Course> gradCourses = new ArrayList<>();

        gradCourses.add(new Course(1000, 30));
        gradCourses.add(new Course(500, 20));
        gradCourses.add(new Course(300, 10));

        grad.setCourses(gradCourses);
        grad.setGpaDiscountStrategy(new GraduateDiscountStrategy());
        grad.setGPA(3.8);
        grad.getCurrentFee();

        List<Course> facultyCourses = new ArrayList<>();

        facultyCourses.add(new Course(1000, 30));
        facultyCourses.add(new Course(500, 20));
        facultyCourses.add(new Course(300, 10));


        faculty.setCourses(facultyCourses);
        faculty.setGpaDiscountStrategy(new NoGPADiscountStrategy());
        faculty.setGPA(3.9);
        faculty.getCurrentFee();

    }
}