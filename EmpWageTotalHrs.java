package com.bridgelabz.employeewage;

/*Calculate Wages till a condition of total working hours or days is reached for a month Assume 100 hours and 20 days*/

public class EmpWageTotalHrs {
    static final int IS_FULL_TIME = 1, IS_PART_TIME = 2, EMP_RATE_PER_HOUR = 20, NUM_OF_WORKING_DAYS = 20 ;
    static final int MAX_HRS_IN_MONTH = 100 ;
    public static void main(String[] args) {
        int empHrs = 0, totalEmpWage = 0,totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
            totalEmpHrs += empHrs ;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr:" +empHrs);
        }
        totalEmpWage = EMP_RATE_PER_HOUR * totalEmpHrs ;
        System.out.println("Employee total wage PER MONTH is " + totalEmpWage);
    }
}