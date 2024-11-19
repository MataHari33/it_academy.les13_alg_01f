package it_academy.les13_alg_01f;

public class Task05 {

	public static void main(String[] args) {
		// Составить программу вычисления N значений функции Y для X,
		//изменяющегося от X1 с шагом dX. В качестве начальных значений выбрать A=1;
		//X1=-2A; dX = A/5.
		double a = 1;
		double x1 = 2*a;
		double dx = a/5;
		double x = x1;
		double n = 10;

		System.out.printf("%4f%10f%n",x,execFunction(x1, a));

		for (int i = 1; i < n;i++) {
			x = x + dx;
			System.out.printf("%4f%10f%n",x,execFunction(x, a));
		}
	}
	public static double execFunction(double x, double a) {
		double y;
		if (x<=0) {
			y = a/2*(Math.pow(Math.E, x/a)+Math.pow(Math.E, -x/a));
		}else
		{
			y = 4*Math.pow(a, 3)/(Math.pow(x, 2)+ 4*Math.pow(a, 2));
		}
		return y;
	}
}
