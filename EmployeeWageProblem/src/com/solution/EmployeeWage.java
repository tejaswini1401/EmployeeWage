package com.solution;
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		
		System.out.println("Employee Wage Problem");
		
		Random random = new Random();
		
		boolean isPresent = random.nextBoolean();
		
		if(isPresent) {
			System.out.println("Employee is Present");	
		}else {
			System.out.println("Employee is not Present");
		}

	}

}
