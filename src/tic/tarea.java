package tic;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tarea {
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		String[] line = sc.readLine().split(" ");
		int x1 = Integer.parseInt(line[0]);
		int y1 = Integer.parseInt(line[1]);
		int x2 = Integer.parseInt(line[2]);
		int y2 = Integer.parseInt(line[3]);

		System.out.println(solve(x1, y1, x2, y2));
	}

	private static int solve(int x1, int y1, int x2, int y2) {
		int dx = Math.abs(x2 - x1);
		int dy = Math.abs(y2 - y1);

		return (gcd(dx, dy) + 1);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
