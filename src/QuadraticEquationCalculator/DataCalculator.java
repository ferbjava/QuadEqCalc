package QuadraticEquationCalculator;

public class DataCalculator {
	private double a;
	private double b;
	private double c;
	
	public DataCalculator(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public double discriminant(){
		return b*b-4*a*c;
	}
	
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void calculate() {
		// TODO Auto-generated method stub
		
	}
}
