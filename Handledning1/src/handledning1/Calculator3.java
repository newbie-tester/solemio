package handledning1;

import java.util.Scanner;

public class Calculator3 {

	public static void main(String[] args) {

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

			double tal3 = 0;
			
			if (choice == 1) {
				tal3 = tal1 + tal2;					
			}
			if (choice == 2) {
				tal3 = tal1 - tal2;
			}
			if (choice == 3) {
				tal3 = tal1 * tal2;
			}
			if (choice == 4) {
				tal3 = tal1 / tal2;
			}
			
			if (choice == 1) {
				System.out.println("Resultat: " + tal3);
			} else if (choice == 2) {
				System.out.println("Resultat: " + tal3);
			} else if (choice == 3) {
				System.out.println("Resultat: " + tal3);
			} else if (choice == 4) {
				System.out.println("Resultat: " + tal3);
				
			
				
//			} else if (choice == 5) {
//				System.out.println("Tack och hej!");
//				break;
//			} else {
//				System.out.println("Du har angett ett ogiltigt val, välj 1-5.\n");
			}
			System.out.println();

		}

	}

}
