package Tutorial2;

public class NewCalculator {

	public static void main(String[] args) {

		System.out.println("Hej och välkommen till miniräknaren! Här kan du räkna två valfria tal.\n");
		
		Menu yourChoice = new Menu();
		CalculationTypes calc = new CalculationTypes();
		Input yourValues = new Input();
		
		
		while (true) {
			
			int choice = yourChoice.alternatives();

			if (choice == 5) {
				calc.exit();
				break;
			}

			if (choice < 1 || choice > 5) {
				calc.invalid();
				continue;
			}	

			double value1 = yourValues.setValues(1);
			double value2 = yourValues.setValues(2);
			double result = calc.calculate(choice, value1, value2);

			System.out.println("Resultat: " + result);
			System.out.println();
			System.out.println("Vill du räkna igen?\n");

		}
	}
}