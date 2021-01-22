package secao8_exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		
		double result = CurrencyConverter.amountReais(dollarPrice, dollarAmount);
		
		System.out.printf("Amount to be paid in Reais = %.2f", result);
		
		
		sc.close();
	}

}
