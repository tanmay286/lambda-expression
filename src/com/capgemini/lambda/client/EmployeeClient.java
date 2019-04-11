package com.capgemini.lambda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient {
	public static void main(String arg[]) {

		/*Comparator<Employee> c = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
			}

		};*/
		Comparator<Employee> c=(e1,e2)->Integer.compare(e1.getEmployeeId(),e2.getEmployeeId());

		TreeSet<Employee> employees = new TreeSet<>((e1,e2)->Integer.compare(e1.getEmployeeId(),e2.getEmployeeId()));
		employees.add(new Employee(101, "Alice", "HR", 34000));
		employees.add(new Employee(54, "Grant", "Admin", 24000));
		employees.add(new Employee(86, "Bob", "Admin", 54000));
		employees.add(new Employee(12, "Taylor", "HR", 34000));

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}
}
