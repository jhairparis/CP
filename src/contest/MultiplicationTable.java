package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiplicationTable {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
		String input = bf.readLine();

		StringTokenizer sb = new StringTokenizer(input);
		int n = Integer.parseInt(sb.nextToken());
		int find = Integer.parseInt(sb.nextToken());

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (find % i == 0 && find / i <= n)
				count++;
		}

		System.out.println(count);
	}
}
