import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); //pega a primeira palavra apenas
		System.out.println("Você digitou: " + x);
		sc.nextLine(); // quebra de linha pendente
		
		String y;
		y = sc.nextLine(); //pega até digitar enter
		System.out.println("Você digitou: " + y);
		
		int z;
		z = sc.nextInt();
		System.out.println("Você digitou: " + z);
		
		double a; //com virgula pela maquina ser PT BR, 
		a = sc.nextDouble();
		System.out.println("Você digitou: " + a); //para resultado com ',' usar printf
		
		char b;
		b = sc.next().charAt(0);
		System.out.println("Você digitou: " + b);
		
		
		
		
		sc.close();

	}

}
