package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> s = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(shape == 'r') {
				System.out.print("Widht: ");
				double widht = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				s.add(new Rectangle(color, widht, height));
			} else if(shape == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				s.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape y : s) {
			System.out.println(y.area());
		}
				
		sc.close();
	}

}
