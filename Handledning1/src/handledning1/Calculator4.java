package handledning1;

import java.util.Scanner;

public class Calculator4 {

	public static void main(String[] args) {
		
		// Extrauppgift 1: Svaret ni får ifrån uträkningen ska kunna användas istället för tal ett i nästa uträkning.
		
		System.out.println("Miniräknare 4 (extrauppgift 1)");
		System.out.println("Välj ett av följande val:");
		System.out.println("1: Addera");
		System.out.println("2: Subtrahera");
		System.out.println("3: Multiplicera");
		System.out.println("4: Dividera");
		System.out.println("5: Avsluta \n");

		Scanner scan = new Scanner(System.in);

//		int choice = scan.nextInt();
//
//		if (choice == 5) {
//			System.out.println("Tack och hej!");
//			break;
//		}
//		
//		if (choice < 1 || choice > 5) {
//			System.out.println("Du har angett ett ogiltigt val, välj 1-5.\n");
//			break;
//		}
//		
		System.out.println("Ange tal 1:");
		double tal1 = scan.nextDouble();

		System.out.println("Ange tal 2:");
		double tal2 = scan.nextDouble();
		
		double tal3;
//		
//		if (choice == 1) {
//			tal3 = tal1 + tal2;					
//		}
//		if (choice == 2) {
//			tal3 = tal1 - tal2;
//		}
//		if (choice == 3) {
//			tal3 = tal1 * tal2;
//		}
//		if (choice == 4) {
//			tal3 = tal1 / tal2;
//		}
	}

}
