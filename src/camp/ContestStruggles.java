package camp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContestStruggles {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] problems = bf.readLine().split(" ");
		String[] average = bf.readLine().split(" ");

		long a = Long.parseLong(problems[0]);
		long b = Long.parseLong(problems[1]);
		long c = Long.parseLong(average[0]);
		long d = Long.parseLong(average[1]);

		double res = ((a * c) - (b * d));
		res /= (a - b);

		if ((res > 100))
			System.out.println("impossible");
		else if (res < 0)
			System.out.println("impossible");
		else
			System.out.println(res);

	}
}