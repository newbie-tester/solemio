package Tutorial2;

import java.util.Scanner;

public class Menu {
	
	public int alternatives() {
		
		System.out.println("Välj ett av följande val:");
		System.out.println("1: Addera");
		System.out.println("2: Subtrahera");
		System.out.println("3: Multiplicera");
		System.out.println("4: Dividera");
		System.out.println("5: Avsluta \n");
		System.out.println("Ange ditt val:");
		Scanner scan = new Scanner(System.in);

		int choice = scan.nextInt();
		
		return choice;
	}
}