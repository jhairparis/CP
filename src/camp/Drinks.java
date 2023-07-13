package camp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drinks {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] elements = bf.readLine().split(" ");

		double sum = 0.0;
		for (int i = 0; i < elements.length; i++)
			sum += Integer.parseInt(elements[i]);

		sum /= n;
		System.out.println(sum);
	}
}
