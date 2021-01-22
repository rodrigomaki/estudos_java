package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employee will be registered? ");
		int qnt = sc.nextInt();
	
		Employee e = null;
		List<Employee> l = new ArrayList<>();
	
		// Inserindo os dados na lista
		
		for (int i = 0; i < qnt; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			e = new Employee(id, name, salary);
			l.add(e);
		}
		
		// Verificando aumento de salário
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		boolean toVerify = false;
		int getId = 0;
		
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getId() == id) {
				toVerify = true;
				getId = i;
			}
		}
		
		if (toVerify) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			l.get(getId).increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		// Imprimindo os empregados
		System.out.println();
		System.out.println("List of employees:");
		for (Employee x : l) {
			System.out.println(x.printer());
		}
		
		sc.close();
		
	}

}
