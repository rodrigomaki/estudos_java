import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int maior = higher(x, y, z);
		showResult(maior);
		
		sc.close();
	}

	public static int higher(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}
		
		return aux;
	}
	
	public static void showResult(int result) {
		System.out.println("Higher: " + result);
	}
	
}
