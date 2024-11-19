package it_academy.les13_alg_01f;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] mas = createArr(0.5, 1, 10 );
		executeFunction(mas);
	}
	public static double executeFunction( double x ) {
		double f;
		f = Math.sqrt(Math.pow(Math.E, 2.2*x))- Math.abs(Math.sin((Math.PI*x)/(x+2d/3)))+1.7;
		return f;
	}
	public static double[] executeFunction( double[] mas ) {
		int i=0;
		double f[]= new double[mas.length];
		System.out.printf("%4s  |  %8s  |  %7s%n","N","X", "Function");
		System.out.println("______________________________");

		for(double x:mas) {
			f[i] = Math.sqrt(Math.pow(Math.E, 2.2*x))- Math.abs(Math.sin((Math.PI*x)/(x+2d/3)))+1.7;
			System.out.printf("%4d  |  %1.6f  |  %1.6f%n",i+1,x, f[i]);
			i++;
		}
		return f;
	}

	public static double[] createArr( double downLim, double upLim, int count) {
		double step = (upLim-downLim)/(count-1);
		double[] arr = new double[count];
		double val = downLim;
		for (int i = 0; i < arr.length; i++) {
			val = downLim+step*i;
			arr[i] = val;
		}
		return arr;
	}
}
