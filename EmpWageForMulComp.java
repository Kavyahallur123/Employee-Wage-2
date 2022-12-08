package com.bridgelabz.employeewage;

public class EmpWageForMulComp {

    //Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    /* @param companyName
     * @param empWagePerHour
     * @param maxWorkingDays
     * @param maxWorkingHrs
     */
    public static void calculateEmployeeWage (String companyName ,int empWagePerHour, int maxWorkingDays,int maxWorkingHrs){
        //variables
        int monthlyEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;


        while (totalWorkingDays < maxWorkingDays && totalEmpHrs < maxWorkingHrs) {
            int empHrs = 0;
            int dailyEmpWage = 0;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    totalWorkingDays++;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    totalWorkingDays++;
            }
            dailyEmpWage = empWagePerHour * empHrs;
            totalEmpHrs += empHrs;
            monthlyEmpWage += dailyEmpWage;
        }
        System.out.println("Employee Wage for a month in " + companyName + " is " + monthlyEmpWage + "\n" +
                "Total Working Hrs: " + totalEmpHrs + "\n" + "Total working days: " + totalWorkingDays);
    }

    public static void main (String args[]){

        System.out.println("Welcome to Employee wage Computation Program for Multiple companies");
        calculateEmployeeWage("Airtel", 100, 25, 200);
        calculateEmployeeWage("Samsung", 180, 26, 200);
    }
}