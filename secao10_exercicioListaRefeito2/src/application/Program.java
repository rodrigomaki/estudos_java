package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> l = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int qnt = sc.nextInt();
		
		for (int i = 1; i <= qnt; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee e = new Employee(id, name, salary);
			l.add(e);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer position = null;
		
		for (int i = 0; i < l.size(); i++) {
			if (id == l.get(i).getId()) {
				position = i;
			}
		}
		
		if (position != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();	
			l.get(position).salaryIncrease(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee x : l) {
			System.out.println(x.printer());
		}
		
		sc.close();
	}

}
