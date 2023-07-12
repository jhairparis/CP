package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LunchBreak{
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String[] s = bf.readLine().split(" ");
			int[] val1 = new int[3];
			ArrayList<Integer> val2 = new ArrayList<Integer>();
			for (int j = 0; j < s.length; j++) {
				val1[j] = Integer.parseInt(s[j]);
				val2.add(Integer.parseInt(s[j]));
			}

			Arrays.sort(val1);
			int x = val1[0];
			int position = val2.indexOf(x);

			if (position == 0) {
				if (i == n - 1)
					sb.append("First");
				else
					sb.append("First \n");
			}
			if (position == 1) {
				if (i == n - 1)
					sb.append("Second");
				else
					sb.append("Second \n");
			}
			if (position == 2) {
				if (i == n - 1)
					sb.append("Third");
				else
					sb.append("Third \n");

			}
		}

		System.out.println(sb.toString());
	}

}