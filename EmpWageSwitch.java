package com.bridgelabz.employeewage;

/*Solving using Switch Case Statement*/

public class EmpWageSwitch {
    static final int IS_FULL_TIME = 1, IS_PART_TIME = 2, EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {
        int empwage = 0, emphrs = 0;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3 ;
        switch (empcheck) {
            case IS_PART_TIME:
                emphrs = 4;
                break;
            case IS_FULL_TIME :
                emphrs = 8;
                break;
            default :
                emphrs = 0;
        }
        empwage = emphrs * EMP_RATE_PER_HOUR ;
        System.out.println("Employee wage is " + empwage );
    }
}