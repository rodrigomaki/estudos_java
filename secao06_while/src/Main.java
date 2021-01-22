import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exercicio 01
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");
		*/
		
		/* Exercicio 02
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while ((x != 0) && (y != 0)) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		*/
		
		/* Exercicio 03
		int a = 0;
		int g = 0;
		int d = 0;
		
		System.out.println("Digite o código do abastecimento:");
		int codigo = sc.nextInt();
		
		while (codigo != 4) {
			switch (codigo) {
			case 1:
				a += 1;
				break;
			case 2:
				g += 1;
				break;
			case 3:
				d += 1;
				break;
			default:
				System.out.println("Código inválido");
				break;
			}
			
			System.out.println("Digite o código do abastecimento:");
			codigo = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		*/
		
		
		
		
		
		sc.close();

	}

}
