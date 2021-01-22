package secao10_exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RentedRooms[] vect = new RentedRooms[10];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new RentedRooms(name, email, room);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getRoom() + ": "
						+ vect[i].getName() + " ,"
						+ vect[i].getEmail());
			}
		}
		
		sc.close();
	}

}
