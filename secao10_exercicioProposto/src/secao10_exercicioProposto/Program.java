package secao10_exercicioProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		Employee emp;
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		
		Employee emp2 = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

		if (emp2 == null ) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp2.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		sc.close();
	}

}
