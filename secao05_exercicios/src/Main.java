import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exercicio 3
		int a, b;
		System.out.println("Digite dois números inteiros separados por um espaço:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {		
			System.out.println("Múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		*/
		
		/* Exercicio 4
		int a, b, aux;
		System.out.println("Digite dois números inteiros separados por um espaço:");
		a = sc.nextInt();
		b = sc.nextInt();
		aux = 0;
		
		if (b > a) {
			aux = b - a;
			System.out.println("O Jogo durou " + aux + " hora(s)");
		} else if (b == a) {
			System.out.println("O Jogo durou 24 hora(s)");
		} else {
			aux = (24 - a) + b;
			System.out.println("O Jogo durou " + aux + " hora(s)");
		}
		*/
		
		/* Exercicio 05
		int a, b;
		System.out.println("Digite dois números inteiros separados por um espaço:");
		a = sc.nextInt();
		b = sc.nextInt();
		double aux = 0;
		
		if (a == 1) {
			aux = b * 4.0;
			System.out.printf("Total: R$ %.2f", aux);
		} else if (a == 2) {
			aux = b * 4.5;
			System.out.printf("Total: R$ %.2f", aux);
		} else if (a == 3) {
			aux = b * 5.0;
			System.out.printf("Total: R$ %.2f", aux);
		} else if (a == 4) {
			aux = b * 2.0;
			System.out.printf("Total: R$ %.2f", aux);
		} else if (a == 5) {
			aux = b * 1.5;
			System.out.printf("Total: R$ %.2f", aux);
		}
		*/
		
		/* Exercicio 06
		double a;
		System.out.println("Digite um número:");
		a = sc.nextDouble();
		
		if ((a >= 0) && (a <= 25)) {
			System.out.println("Intervalo [0, 25]");
		} else if (a > 25 && a <= 50) {
			System.out.println("Intervalo (25, 50]");
		} else if (a > 50 && a <= 75) {
			System.out.println("Intervalo (50, 75]");
		} else if (a > 75 && a <= 100) {
			System.out.println("Intervalo (75, 100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		*/
		
		/* Exercicio 07
		double a, b;
		System.out.println("Digite dois números com uma casa decimal:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if (a == 0 && b == 0) {
			System.out.println("Origem");
		} else if (a == 0 && b != 0) {
			System.out.println("Eixo Y");
		} else if (a != 0 && b == 0) {
			System.out.println("Eixo X");
		} else if (a > 0 && b > 0) {
			System.out.println("Q1");
		} else if (a > 0 && b < 0) {
			System.out.println("Q4");
		} else if (a < 0 && b > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Q3");
		}
		*/
		
		/* Exercicio 08
		*/
		double a, aux;
		System.out.println("Digite um número com duas casas decimais:");
		a = sc.nextDouble();
		aux = 0;
		
		if (a > 0 && a <= 2000.00) {
			System.out.println("Isento");
		} else if (a <= 3000.00) {
			aux = (a - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", aux);
		} else if (a <= 4500.00) {
			aux = ((a - 3000.00) * 0.18) + (1000.00 * 0.08);
			System.out.printf("R$ %.2f", aux);
		} else if (a > 4500.00) {
			aux = ((a - 4500.00) * 0.28) + (1000.00 * 0.08) + (1500.00 * 0.18); 
			System.out.printf("R$ %.2f", aux);
		}
		
		
		sc.close();

	}

}
