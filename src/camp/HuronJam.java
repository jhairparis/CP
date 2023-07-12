package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HuronJam {

	public static void main(String[] args) throws Throwable {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] students = bf.readLine().split(" ");
		int res = 0;

		for (int i = 0; i < students.length - 1; i += 2) {
			int val = Integer.parseInt(students[i]);
			int x = i + 1;
			int nextVal = Integer.parseInt(students[x]);

			res += nextVal - val;
		}
		System.out.println(res);

	}

}