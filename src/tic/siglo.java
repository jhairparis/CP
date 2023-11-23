package tic;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class siglo {
	public static int solve(int year) {
		if (year <= 100) {
			return 1;
		} else if (year % 100 == 0) {
			return year / 100;
		} else {
			return (year / 100) + 1;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(sc.readLine());

		int s = solve(year);
		System.out.println(s);
	}
}
