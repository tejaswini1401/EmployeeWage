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
	 	 
		 final int maxHours = 100;
		 final int maxDays = 20;
		 final int partTime = 4;
		 
		 double dailyWage;
		 double totalWage = 0;
	     int totalHoursWorked = 0;
	     int totalDaysWorked = 0;

		System.out.println("Select Employee Type:");
        System.out.println("1. Full-Time");
        System.out.println("2. Part-Time");
        System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
	
		switch (choice) {
        case 1:
            
            double hoursWorkedPerDay = 10;

            while (totalHoursWorked < maxHours && totalDaysWorked < maxDays) {

           	 dailyWage = wagePerHour * hoursWorkedPerDay;
                totalWage += dailyWage;

                totalHoursWorked += hoursWorkedPerDay;
                totalDaysWorked++;
            }
            System.out.printf("The total wage for a Full-Time employee is: "+ totalWage);
            break;

        case 2:

            while (totalHoursWorked < maxHours && totalDaysWorked < maxDays) {

           	 dailyWage = wagePerHour * partTime;
                totalWage += dailyWage;
                totalHoursWorked += partTime;
                totalDaysWorked++;
            }
            System.out.printf("The total wage for a Part-Time employee is: ", totalWage);
            break;

        default:
            System.out.println("Invalid choice");
            break;
    }
		sc.close();

	}

}
