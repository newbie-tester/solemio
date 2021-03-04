package Tutorial2;

public class CalculationTypes {

	public double add(double value1, double value2) {
		return value1 + value2;
	}

	public double subtract(double value1, double value2) {
		return value1 - value2;
	}

	public double multiply(double value1, double value2) {
		return value1 * value2;
	}

	public double divide(double value1, double value2) {
		return value1 / value2;
	}

	public void exit() {
		System.out.println("Tack och hej!");
	}

	public void invalid() {
		System.out.println("Du har angett ett ogiltigt val.\n");
	}

	public double calculate(int choice, double value1, double value2) {

		double result = 0;

		if (choice == 1) {
			result = add(value1, value2);
		} else if (choice == 2) {
			result = subtract(value1, value2);
		} else if (choice == 3) {
			result = multiply(value1, value2);
		} else if (choice == 4) {
			result = divide(value1, value2);
		}
	
		return result;
	}

}
