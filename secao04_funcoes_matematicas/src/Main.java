
public class Main {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); // raiz quadrada
		System.out.println("Raiz quadrada de " + x + ": " + A);
		
		B = Math.pow(x, y); // potencia de x elevado a y
		System.out.println(x + " elevado a " + y + ": " + B);
		
		C = Math.abs(z);
		System.out.println("Número absoluto de " + z + ": " + C);
		
	}

}
