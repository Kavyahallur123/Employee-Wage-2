/*Store the Daily wage along with the Total Wage*/

package com.bridgelabz.employeewage.StoreDailywage;

import com.bridgelabz.employeewage.MultipleCompanies.CompanyEmpWage;
import com.bridgelabz.employeewage.UsingInterface.EmployeeWage;

import java.util.*;

public class SaveWage  implements EmployeeWage {

    //ArrayList for Company Wage Object
    ArrayList<CompanyEmpWage> mulComPanyEmpWages;

    //Hashmap for storing daily wage
    HashMap<String, Integer> totalEmpWages;

    public SaveWage() {
        mulComPanyEmpWages= new ArrayList<>();
        totalEmpWages = new HashMap<>();
    }

    private void addCompanyEmpWages(String company, int wagePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        mulComPanyEmpWages.add(new CompanyEmpWage(company,wagePerHr,numOfWorkingDays,maxHrsPerMonth));
    }

    public void calculateEmpWage() {
        for (CompanyEmpWage companyEmpWage : mulComPanyEmpWages) {
            companyEmpWage.setTotalEmpWage(this.calculateEmpWage(companyEmpWage));
            System.out.println(companyEmpWage.toString());
        }
    }

    //Method to Calculate Employee Wage by Hours and Type
    public int calculateEmpWage(CompanyEmpWage companyEmpWage) {
        // Local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Compute Emp Wage for Month
        while( totalEmpHrs < companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {
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
        int totalWage = totalEmpHrs * companyEmpWage.wagePerHr;
        totalEmpWages.put(companyEmpWage.companyName, totalWage);
        return totalWage;
    }

    void printTotalEmpWages()
    {
        System.out.println("The Companies and their total Employee Wages are:");
        for (String companyName : totalEmpWages.keySet())
        {
            System.out.println(companyName + ": " + totalEmpWages.get(companyName));
        }

    }

    public static void main(String[] args) {
        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem.");
        SaveWage employeeWageBuilder = new SaveWage();
        employeeWageBuilder.addCompanyEmpWages("Jio",20,5,25);
        employeeWageBuilder.addCompanyEmpWages("Samsung",15,30,30);
        employeeWageBuilder.calculateEmpWage();
        employeeWageBuilder.printTotalEmpWages();
    }
}

