import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exercício 01
		int x = sc.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if ((i % 2) != 0) {
				System.out.println(i);
			}
		}
		*/
		
		/* Exercício 02
		int in = 0;
		int out = 0;
		int x = 0;
		int contador = sc.nextInt();
		
		for (int i = 0; i < contador; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		*/
		
		/* Exercício 03
		int contador = sc.nextInt();
		
		for (int i = 0; i < contador; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		*/
		
		/* Exercício 04
		int contador = sc.nextInt();
		double resultado = 0;
		
		for (int i = 0; i < contador; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("Divisão impossível");
			} else {
				resultado = (double) a / b;
				System.out.printf("%.1f \n", resultado);
			}
		}
		*/
		
		/* Exercício 05
		int x = sc.nextInt();
		int calculo = 1;
		
		for (int i = x; i > 0; i--) {
			calculo *= i;
		}
		
		System.out.println(calculo);
		*/
		
		/* Exercício 06
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		*/
		
		/* Exercicio 07
		int x = sc.nextInt();
		int quadrado = 0;
		int cubo = 0;
		
		for (int i = 1; i <= x; i++) {
			
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.println(i + " " + quadrado + " " + cubo);
			
		}
		*/
		
		
		sc.close();

	}

}
