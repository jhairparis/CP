package camp;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class RayThroughGlasses {
	static BigInteger[] arr = new BigInteger[1001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Arrays.fill(arr, new BigInteger("-1"));
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("2");
		arr[2] = new BigInteger("3");

		ArrayList<BigInteger> win = new ArrayList<>();
		String input;
		while ((input = bf.readLine()) != null && !(input.length() <= 0)) {
			int n = Integer.parseInt(input);
			win.add(solveDP(n));
		}

		for (BigInteger bigInteger : win) {
			System.out.println(bigInteger);
		}
	}

	public static int solve(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 2;
		if (n == 2)
			return 3;

		else
			return (solve(n - 1) + solve(n - 2));
	}

	public static BigInteger solveDP(int n) {
		if (arr[n].equals(new BigInteger("-1")))
			arr[n] = solveDP(n - 1).add(solveDP(n - 2));

		return arr[n];
	}
}
