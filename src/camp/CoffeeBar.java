package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeBar {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] val = new String[n];

		for (int i = 0; i < n; i++)
			val[i] = bf.readLine();

		if (val.length == 1) {
			System.out.println(val[0]);
		} else {
			int rand = (int) (Math.random() * (n - 1) + 0);
			System.out.println(val[rand]);
		}

	}
}
