package secao8_exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println(r);
		
		sc.close();
	}

}
