/*Ability to manage Employee Wage of multiple companies using Interface approach - Note: Refactor to have one
EmpWageBuilder to implement Interface*/

package com.bridgelabz.employeewage.UsingInterface;

import com.bridgelabz.employeewage.MultipleCompanies.CompanyEmpWage;

public class EmployeeWageBuilderArr implements EmployeeWage{
    private int noOfCompanies = 0;
    private CompanyEmpWage[] companyEmpWages;

    public EmployeeWageBuilderArr() {
        companyEmpWages = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWages(String company, int wagePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        companyEmpWages[noOfCompanies] = new CompanyEmpWage(company,wagePerHr,numOfWorkingDays,maxHrsPerMonth);
        noOfCompanies++;
    }

    public void calculateEmpWage() {
        for (int i = 0; i < noOfCompanies; i++) {
            companyEmpWages[i].setTotalEmpWage(this.calculateEmpWage(companyEmpWages[i]));
            System.out.println(companyEmpWages[i].toString());
        }
    }

    //Method to Calculate Employee Wage by Hours and Type
    public int calculateEmpWage(CompanyEmpWage companyEmpWage) {
        // Local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Compute Emp Wage for Month
        while( totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {
            totalWorkingDays++;     //Incrementing Working Days
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day No :"+ totalWorkingDays +" Emp Hrs: "+ empHrs);
        }
        return totalEmpHrs * companyEmpWage.wagePerHr;
    }

    public static void main(String[] args) {
        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem.");
        EmployeeWageBuilderArr employeeWageBuilderArray = new EmployeeWageBuilderArr();
        employeeWageBuilderArray.addCompanyEmpWages("JIO",20,5,25);
        employeeWageBuilderArray.addCompanyEmpWages("VODAFONE",15,30,30);
        employeeWageBuilderArray.calculateEmpWage();
    }
}