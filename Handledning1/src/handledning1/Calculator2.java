package handledning1;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv ett tal: ");		
		double tal1 = scan.nextDouble();
		
		System.out.println("Skriv ett till tal: ");
		double tal2 = scan.nextDouble();
		
		System.out.println("Addition: " + (tal1 + tal2));
		System.out.println("Subtraktion: " + (tal1 - tal2));
		System.out.println("Multiplikation: " + (tal1 * tal2));
		System.out.println("Division: " + (tal1 / tal2));


	}

}
