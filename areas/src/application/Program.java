package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Circle;
import application.entities.Rectangle;
import application.entities.Shape;
import application.entities.enums.Color;

/*
 * Comentários para fins didáticos
 */

public class Program {

	public static void main(String[] args) {

		List<Shape> list = new ArrayList<>();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of de Shapes: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {

			System.out.println("Shape #" + i + " data: ");

			System.out.print("Rectangle or Circle (r/c)? ");
			char retOrCir = sc.next().charAt(0);

			// No uso de Char, as Aspas ('r') são simples.
			if (retOrCir == 'r') {

				System.out.print("Color (BLACK/BLUE/RED): ");
				/*
				 * A palavra que for digitada no campo, será convertida
				 * para o Objeto Color.
				 */
				Color color = Color.valueOf(sc.next());

				System.out.print("Width: ");
				Double width = sc.nextDouble();

				System.out.print("Heigth: ");
				Double heigth = sc.nextDouble();

				list.add(new Rectangle(color, width, heigth));

			} else if (retOrCir == 'c') {
				
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());

				System.out.print("Radius: ");
				Double radius = sc.nextDouble();

				list.add(new Circle(color, radius));

			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS");
		/*
		 * Vai mostrar a área correspondentes ao circulo e retângulo.
		 */
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
			
		}


		sc.close();
	}

}
