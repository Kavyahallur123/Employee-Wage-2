package com.bridgelabz.employeewage;

/*Ability to save the Total Wage for Each Company - Note: You can Create EmpWageBuilder for each Company
- Use Instance Variable instead of function parameters*/

public class EmpWageCompSave {
    //Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    /* @param companyName
     * @param empWagePerHour
     * @param maxWorkingDays
     * @param maxWorkingHrs
     */
    String companyName ;
    int empWagePerHour;
    int maxWorkingDays;
    int maxWorkingHrs;
    int monthlyEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;
    EmpWageCompSave(String companyName ,int empWagePerHour, int maxWorkingDays,int maxWorkingHrs) {
        this.companyName = companyName;
        this.empWagePerHour = empWagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHrs = maxWorkingHrs;
    }
    public  void calculateEmployeeWage (){
        //variables



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
    }

    @Override
    public String toString() {
        return "Employee Wage for a month in " + companyName + " is " + monthlyEmpWage + "\n" +
                "Total Working Hrs: " + totalEmpHrs + "\n" + "Total working days: " + totalWorkingDays ;
    }

    public static void main (String args[]){

        System.out.println("Welcome to Employee wage Computation Program for Multiple companies");
        System.out.println("===============================================");
        EmpWageCompSave company1= new EmpWageCompSave("Jio", 100, 24, 200);
        EmpWageCompSave company2= new EmpWageCompSave("Vodafone", 180, 26, 200);
        company1.calculateEmployeeWage();
        System.out.println(company1.toString());
        System.out.println("===============================================");
        company2.calculateEmployeeWage();
        System.out.println(company2.toString());
    }
}