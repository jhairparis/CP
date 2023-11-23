package tic;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pared {
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String[] line = sc.readLine().split(" ");

		int base = Integer.parseInt(line[0]);
		int height = Integer.parseInt(line[1]);

		int paintNeeded = calculatePaintNeeded(base, height);

		System.out.println(paintNeeded);
	}

	private static int calculatePaintNeeded(int base, int height) {
		int area = base * height;
		return area;
	}

}
