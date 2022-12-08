package com.bridgelabz.employeewage;
/*Add Part time Employee & Wage Assume Part time Hour is 8*/

public class PartTimeEmpWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1, IS_PART_TIME = 2, EMP_RATE_PER_HOUR = 20;
        int emphrs = 0, empwage = 0;
        double employeeCheck = Math.floor(Math.random() * 10) % 3;
        if ( employeeCheck == IS_FULL_TIME ) {
            emphrs = 12;
            System.out.println("Employee is Full time");
        }
        else if ( employeeCheck == IS_PART_TIME) {
            emphrs = 8;
            System.out.println("Employee is part time");
        }
        else {
            emphrs = 0;
            System.out.println("Employee is absent");
        }
        empwage = emphrs * EMP_RATE_PER_HOUR ;
        System.out.println("Employee wage is " + empwage);
    }
}