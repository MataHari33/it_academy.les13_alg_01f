package it_academy.les13_alg_01f;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.1;
		double step = 0.1;
		double f = -100000000;
		double f1 = -100000000;

		while ((Math.signum(f) != Math.signum(f1))  && x <10) {
			f1 = f;
			f = Math.pow(x, 2) - Math.pow(Math.E, 2*x)+4;
			System.out.printf("%10f  %10f%n", x, f);
			x = x +step;
		}
	}

}
