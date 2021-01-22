import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
		
		System.out.print("\n");
		
		System.out.println("Product data: " + p.toString() + "\n");
		
		System.out.print("Enter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		
		System.out.print("\n");
		
		System.out.println("Updated data: " + p.toString() + "\n");
		
		System.out.print("Enter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt());
		
		System.out.print("\n");
		
		System.out.println("Updated data: " + p.toString() + "\n");
		
		
		sc.close();
	}

}
