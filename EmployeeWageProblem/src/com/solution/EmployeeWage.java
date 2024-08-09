package com.solution;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee Wage Problem");
		
		Random random = new Random();
		
		boolean isPresent = random.nextBoolean();
		
		if(isPresent) {
			System.out.println("Employee is Present");	
		}else {
			System.out.println("Employee is not Present");
		}
		
		double wagePerHour = 20;
		int fullDayHour = 8;
		int partTime = 4;
		double monthlyWage;
        final int workingDaysPerMonth = 20;

		System.out.println("Select Employee Type:");
        System.out.println("1. Full-Time");
        System.out.println("2. Part-Time");
        System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
	
        switch(choice) {
		
		case 1 :
			double dailyEmpWage = wagePerHour * fullDayHour;
			monthlyWage = dailyEmpWage * workingDaysPerMonth;
			System.out.println("Monthly Employee Wage for full time is "+ monthlyWage);
			break;
		case 2:
			double partTimeEmpWage = wagePerHour * partTime;
			monthlyWage = partTimeEmpWage * workingDaysPerMonth;
			System.out.println("Monthly Employee Wage for part time is "+ monthlyWage);
			break;
			
		default:
			System.out.println("Invalid Choice");
        }
		sc.close();

	}

}
