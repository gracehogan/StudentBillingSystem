package org.example;

public class Course {

    double courseRate;
    int hours;

    public Course(double courseRate, int hours) {
        this.courseRate = courseRate;
        this.hours = hours;
    }

    public double getCourseRate() {
        return courseRate;
    }

    public int getHours() {
        return hours;
    }


}
