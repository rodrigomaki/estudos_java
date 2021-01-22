package teste_break;

public class Program {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break; // interrompe a estrutura
			}
			if (i >=6) {
				System.out.println("Passou pro 6");
			}
		}
		
		System.out.println("final");

	}

}
