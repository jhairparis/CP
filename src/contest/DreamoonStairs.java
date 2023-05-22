package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Dreamoon and Stairs
public class DreamoonStairs {
	public static void main(String[] args) throws Exception {
		String[] bf = new BufferedReader(new InputStreamReader(System.in)).readLine().trim().split(" ");

		int n = Integer.parseInt(bf[0]);
		int m = Integer.parseInt(bf[1]);

		int i = 1;
		while (i <= n) {
			if (n % 2 == 0) {
				if (i % m == 0 && i >= n / 2) {
					System.out.println(i);
					return;
				}
			} else {
				if (i % m == 0 && i >= (n + 1) / 2) {
					System.out.println(i);
					return;
				}
			}
			i++;
		}

		System.out.println(-1);
	}
}