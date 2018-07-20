package QuadraticEquationCalculator;

public class QuadraticEquationCalculator {

	public QuadraticEquationCalculator() {

	}

	public void solver(double a, double b, double c) {
		DataCalculator data = new DataCalculator(a, b, c);
		data.discriminant();
		data.calculate();
	}

}
