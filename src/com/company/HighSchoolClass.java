package com.company;


public class HighSchoolClass {

    private Student [] students;

    public Student getValedictorian(){
        for(Student findVal: students){
            Student valedictorian;
            double vale = 0;
            if(findVal.getGPA() > vale);
            valedictorian = findVal;
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
