package com.bridgelabz.employeewage;

/*Calculating Wages for a Monthly Assume 20 Working Day per Month*/

public class MonthlyEmpWage {
    static final int IS_FULL_TIME = 1, IS_PART_TIME = 2, EMP_RATE_PER_HOUR = 20, NUM_OF_WORKING_DAYS = 20 ;
    public static void main(String[] args) {
        int empWage = 0, empHrs = 0, totalEmpWage = 0;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3 ;
        switch (empcheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME :
                empHrs = 8;
                break;
            default :
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR ;
        totalEmpWage = NUM_OF_WORKING_DAYS * empWage ;
        System.out.println("Employee wage PER DAY is " + empWage );
        System.out.println("Employee total wage PER MONTH is " + totalEmpWage);
    }
}