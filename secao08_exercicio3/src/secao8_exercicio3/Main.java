package secao8_exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		s.name = sc.nextLine();
		s.n1 = sc.nextDouble();
		s.n2 = sc.nextDouble();
		s.n3 = sc.nextDouble();
		
		System.out.println(s);
		
		sc.close();
	}

}
