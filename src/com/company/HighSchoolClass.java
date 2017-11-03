package com.company;


public class HighSchoolClass {

    private Student [] students;

    public Student getValedictorian(){
        for(Student findVal: students){

        }
        return valedictorian;
    }

    public double getHonorsPercentage(){
        int num = 0;
        for (Student mer: students){

            if(mer.isHonors()){
                num++;
            }
        }
        return (double)num/students.length;
    }



}
