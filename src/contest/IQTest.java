package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//R - IQ test
public class IQTest {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] values = bf.readLine().split(" ");

		int even = 0;
		int odd = 0;
		int positionE = -1;
		int positionO = -1;

		for (int i = 0; i < values.length; i++) {
			int value = Integer.parseInt(values[i]);

			if (value % 2 == 0) {
				even++;
				positionE = i + 1;
			} else {
				odd++;
				positionO = i + 1;
			}
		}
		if (odd == 1)
			System.out.println(positionO);

		if (even == 1)
			System.out.println(positionE);

	}
}
