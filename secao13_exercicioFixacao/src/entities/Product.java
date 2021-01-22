package entities;

public class Product {

	// atributos
	private String name;
	private double price;
	
	// construtores
	public Product() {
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
