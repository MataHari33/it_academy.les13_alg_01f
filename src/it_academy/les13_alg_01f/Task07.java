package it_academy.les13_alg_01f;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double z = 0;
		double nz = 0.5;
		double x = 0;
		double nx = 0.1;
		int m = 4;
		int n = 10;
		double f;
		f = Math.sqrt(Math.pow(z, 2)+Math.pow(x, 2))*Math.log(z) + Math.abs(Math.log(z))/Math.sqrt(Math.pow(x, 2)- Math.pow(z, 2)+3.2);
		System.out.println(f);
		for (int i = 1; i<n;i++) {
			z = z+nz;
			for (int j = 1; j<m;j++) {
				x = x+nx;
				f = Math.sqrt(Math.pow(z, 2)+Math.pow(x, 2))*Math.log(z) + Math.abs(Math.log(z))/Math.sqrt(Math.pow(x, 2)- Math.pow(z, 2)+3.2);
				System.out.printf("%10f %10f %10f %n",x, z, f);
			}
		}
		
	}

}
