package handledning1;

import java.util.Scanner;

public class Calculator3a {

	public static void main(String[] args) {
		
		// Using "Switch" to solve iteration 3 instead.
		
		System.out.println("Hej och välkommen till miniräknaren! Här kan du räkna två valfria tal.\n");
		System.out.println("Välj ett av följande val:");
		System.out.println("1: Addera");
		System.out.println("2: Subtrahera");
		System.out.println("3: Multiplicera");
		System.out.println("4: Dividera");
		System.out.println("5: Avsluta \n");

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Ange ditt val:");
			int choice = scan.nextInt();

			if (choice == 5) {
				System.out.println("Tack och hej!");
				break;
			}
			
			if (choice < 1 || choice > 5) {
				System.out.println("Du har angett ett ogiltigt val, välj 1-5.\n");
				break;
			}
			
			System.out.println("Ange tal 1:");
			double tal1 = scan.nextDouble();

			System.out.println("Ange tal 2:");
			double tal2 = scan.nextDouble();

			switch (choice) {
				case 1:
					System.out.println("Resultat: " + (tal1 + tal2));				
					break;
				case 2:
					System.out.println("Resultat: " + (tal1 - tal2));
					break;
				case 3:
					System.out.println("Resultat: " + (tal1 * tal2));
					break;
				case 4:
					System.out.println("Resultat: " + (tal1 / tal2));
					break;
				}
			
			System.out.println();

	}

}

}