package com.bridgelabz.employeewage;
/*Calculate Daily Employee Wage Assume Wage per Hour is 20 Assume Full Day Hour is 8*/
public class DailyWage {
    public static void main(String[] args) {
        int IS_PRESENT = 1, EMP_RATE_PER_HOUR = 20;
        int emphrs = 0, empwage = 0;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if ( employeeCheck == 1)
            emphrs = 8;
        else
            emphrs = 0;
        empwage = emphrs * EMP_RATE_PER_HOUR ;
        System.out.println("Employee wage is " + empwage);
    }
}