

import java.util.Scanner;

//A. Team
public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (!(n >= 1 && n <= 1000)) {
			sc.close();
			return;
		}

		int[][] maT = new int[n][3];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				int x = sc.nextInt();
				maT[i][j] = x;
				sum += x;
			}
			if (sum >= 2)
				count += 1;
		}

		System.out.println(count);

		sc.close();
	}
}
