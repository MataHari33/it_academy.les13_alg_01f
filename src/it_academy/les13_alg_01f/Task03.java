package it_academy.les13_alg_01f;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.5;
		int n = 20;
		System.out.println(executeFunction(x,n));
	}
	public static double executeFunction(double x, int n) {
		double sum = 0;
		double result = 0;
		for(int k=1; k<=n;k++) {
			sum = sum + (Math.sin(k*x/2) +Math.sin((k*x-1)/2))/Math.pow(Math.E, x-1/k);  
		}
		result = sum * Math.sqrt(n*Math.PI);
		return result;
	}


}
