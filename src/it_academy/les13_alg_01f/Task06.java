package it_academy.les13_alg_01f;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k = -30;
		double f;
		int countNoInt = 0;
		double step = (60d+30d)/20;
		//	System.out.println((60+30)/20);
		for (int i=0; i<20;i++) {
			k = k + step;
			//	System.out.println(k);
			if ((int)k == k) {
				f = Math.pow(k, 3)-25*Math.pow(k, 2)+50*k+1000;
				//A=3*103  B=6*104 , M=4.
				if ((f > Math.sqrt(3000+60000+4) && f < 4*Math.sqrt(3000+60000)) ||(f>Math.sqrt(3000*60000*4) && f<4*Math.sqrt(3000*60000))) {
					System.out.printf("%10f   %10f%n",k,f);
				}
			}else
			{
				countNoInt++;
			}
		}
		System.out.println(countNoInt+" - количество значений, которые не удовлетворяют заданному условию.");
	}

}
