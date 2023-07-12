package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BachgoldProblem {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String sb = "";
		if (n % 2 == 1) {
			n /= 2;
			System.out.println(n);
			n--;
			for (int i = 0; i < n; i++)
				sb += 2 + " ";
			System.out.println(sb + "3");
		} else {
			n /= 2;
			System.out.println(n);
			for (int i = 0; i < n; i++)
				sb += 2 + " ";
			System.out.println(sb);
		}
	}
}