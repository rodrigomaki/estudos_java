package secao9_construtores;

public class Product {

	// atributos
	public String name;
	public double price;
	public int quantity;
	
	// construtores
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/* 
	 * Na aula sobre sobrecarga, foi ensinado outro tipo de construtor onde não foi preciso iniciar os 3 atributos
	 * pensando na possibilidade de o produto não ter quantidade em estoque ainda
	 */
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// métodos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
	
}
