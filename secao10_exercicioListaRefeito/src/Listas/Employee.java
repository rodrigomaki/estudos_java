package Listas;

public class Employee {

	// atributos
	private int id;
	private String name;
	private double salary;
	
	// construtores
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// métodos
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	public String printer() {
		return id 
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
	}
	
	// getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}

}
