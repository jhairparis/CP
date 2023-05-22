package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MishkaAndGame {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int m = 0;
		int c = 0;
		int draw = 0;

		for (int i = 0; i < n; i++) {
			String[] g = bf.readLine().split(" ");
			int m1 = Integer.parseInt(g[0]);
			int c1 = Integer.parseInt(g[1]);

			if (m1 == c1)
				draw++;
			else if (m1 > c1)
				m++;
			else
				c++;
		}

		if (m == c) {
			System.out.println("Friendship is magic!^^");
			return;
		}

		float promM = (float) m / n;
		float promC = (float) c / n;

		if (promM > promC)
			System.out.println("Mishka");
		else
			System.out.println("Chris");

	}
}
