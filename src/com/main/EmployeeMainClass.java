package com.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.employee.Employee;

public class EmployeeMainClass {

	public static void main(String[] args) {
	
		List<Employee> emp = Arrays.asList(
				new Employee(1, "Prabhakar", 600000.00, 84),
				new Employee(1, "Prabhakar", 73634.00, 64),
				new Employee(1, "Prabhakar", 80888.00, 24),
				new Employee(1, "Prabhakar", 5363.00, 74),
				new Employee(1, "Prabhakar", 6384849.00, 84),
				new Employee(1, "Prabhakar", 123.00, 14),
				new Employee(1, "Prabhakar", 923983.00, 24),
				new Employee(1, "Prabhakar", 62162.00, 14)
				);
		
				Optional<Employee> maxSalary = emp.stream().max(Comparator.comparingDouble(Employee::getSalary));
				maxSalary.ifPresent(employee->System.out.println("Max Salary Of Employee In List:-" + employee.getSalary()));
	
				
				
				Optional<Employee> minSalary = emp.stream().min(Comparator.comparingDouble(Employee::getSalary));
				minSalary.ifPresent(employee->System.out.println("Min Salary Of Employee In List :-" + employee.getSalary()));
	}
}
