import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.2345;
		
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.println("Bom dia");
		
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		String nome = "Maria";
		int idade = 32;
		double salario = 3450.00;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f.\n", nome, idade, salario);
		
		System.out.println("========================================");
		
		System.out.println("Exercício proposto \n\n");
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");
		
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f\n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
