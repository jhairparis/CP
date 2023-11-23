package tic;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.lang.Math;

public class rombos {
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int x1 = Integer.parseInt(sc.readLine());
		int y1 = Integer.parseInt(sc.readLine());
		int x2 = Integer.parseInt(sc.readLine());
		int y2 = Integer.parseInt(sc.readLine());
		int x3 = Integer.parseInt(sc.readLine());
		int y3 = Integer.parseInt(sc.readLine());
		int x4 = Integer.parseInt(sc.readLine());
		int y4 = Integer.parseInt(sc.readLine());

		double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double d2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double d3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		double d4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));

		if (d1 == d2 && d2 == d3 && d3 == d4) {
			int dotProduct = (x2 - x1) * (x3 - x2) + (y2 - y1) * (y3 - y2);
			if (dotProduct == 0) {
				System.out.println("cuadrado");
			} else {
				System.out.println("rombo");
			}
		} else {
			System.out.println("ninguno");
		}
	}
}
