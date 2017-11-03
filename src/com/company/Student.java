package com.company;

public class Student {

    public double gpa;

    public Student(double g){
        gpa = g;
    }

    public double getGPA(){

        return gpa;

    }

    public boolean isHonors(){

        return gpa > 4.0;

    }



}
