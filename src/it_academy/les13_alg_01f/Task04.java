package it_academy.les13_alg_01f;

import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
/*
		System.out.println("Введите координату X");
		x = sc.nextInt();
		System.out.println("Введите координату Y");
		y = sc.nextInt();
		System.out.print("Координата ("+x+ ", "+y+") ");
		if (checkPoint(x, y)) {
			System.out.println("принадлежит заданному пространству значений.");
		}else	
		{	System.out.println("не принадлежит заданному пространству значений.");
		}
*/
		System.out.println("Введите количество рандомных точек");
		int n = sc.nextInt();
		int[][] mas = new int [n][4];
		init(mas);
		print (mas);
		for (x = 0; x<mas.length;x++) {
			for (y = 0; y<mas[0].length;y++) {
				System.out.print("Координата ("+x+ ", "+y+") ");
				if (checkPoint(x,y)) {
					System.out.println(" принадлежит заданному пространству значений.");
				}else
				{
					System.out.println(" не принадлежит заданному пространству значений.");
				}
			}
		}
	}
	public static void init(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j/2*2!=j) {
				mas[i][j] = rand.nextInt(5);}else
				{mas[i][j] = - rand.nextInt(5);}
			}
		}
	}
	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

	public static boolean checkPoint(int x, int y) {
		if (Math.abs(x)>2 | y>2 | y<-1) {
			return false;
		}
		if (x>0 && x<=2) {
			if (y>=-1 && y<=1) {
				return true;
			}
		}else
		{if (x<=0 && x>=-2) {
			if (y>=0 && y<=2) {
				return true;
			}else 
			{
				return false;
			}
		}

		}
		return false;
	}
}