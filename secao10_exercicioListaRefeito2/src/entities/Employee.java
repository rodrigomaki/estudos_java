package entities;

public class Employee {

	// atributos
	private Integer id;
	private String name;
	private Double salary;
	
	// construtores
	public Employee() {
	}
	
	public Employee (Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// métodos
	public void salaryIncrease(double percentage) {
		salary += salary * percentage / 100;
	}
	
	public String printer() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

	// getter e setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
}