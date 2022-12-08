/*Refactor the code to write a class Method to Compute Employee wage*/

package com.bridgelabz.employeewage;

public class UseClassMethodVariable {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_HRS_IN_MONTHS = 100;

    //Class Variables
    public static int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;
    public static int numOfWorkingDays = 20;

    /**
     * static method for computing the wage for employee.
     */
    private static void wageComputation() {
        while ( totalEmpHrs < MAX_HRS_IN_MONTHS && totalWorkingDays < numOfWorkingDays ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }

        int empWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage : " + empWage);
    }

    /**
     * Below is the main method EmpWageComputation program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        wageComputation();
        System.out.println("Total Working Hrs: "+totalEmpHrs);
    }

}
