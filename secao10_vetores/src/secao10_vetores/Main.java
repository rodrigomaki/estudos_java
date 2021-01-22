package secao10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Soma de alturas para calcular a média
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}

		double resultado = soma / n;
		
		System.out.printf("Média = %.2f", resultado);
		
		sc.close();
	}

}
