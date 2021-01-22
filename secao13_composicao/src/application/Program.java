package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// inserindo os dados dos trabalhadores
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker w = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		// instanciando os contratos
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (dd/mm/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			w.addContract(contract);
			
		}
		
		// calculando o salario por contratos
		System.out.println();
		System.out.println("Enter month and year to calculate income (mm/yyyy): ");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		System.out.println("Name: " + w.getName());
		System.out.println("Departmento: " + w.getDepartment().getName());
		System.out.println("Income for: " + monthYear + ": " + String.format("%.2f", w.income(year, month)));
		
		sc.close();

	}

}
