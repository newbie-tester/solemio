package Tutorial2;

import java.util.Scanner;

public class Input {

	public double setValues(int number) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ange tal " + number + ":");
		double value = scan.nextDouble();
	
		return value;
	}
	
	
}
