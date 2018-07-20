package QuadraticEquationCalculator;

public class QuadraticEquationCalculator {
	private double a;
	private double b;
	private double c;
	private double delta;
	private double x1;
	private double x2;
	
	public QuadraticEquationCalculator(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public void solver() {
		delta=discriminant();
		calculate();
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

	private double discriminant() { 
		return b*b-4*a*c;
	}

	private void calculate() {
		if(delta<0){
			setX1(0);
			setX2(0);
		}else if (delta==0){
			setX1(-b/(2*a));
			setX2(getX1());
		}else {
			setX1((-b-Math.sqrt(delta))/(2*a));
			setX2((-b+Math.sqrt(delta))/(2*a));
		}
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

}
