package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// E - Helpful Maths
public class HelpfulMaths {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		String[] arr = input.split("\\+");

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				return Integer.compare(x, y);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				sb.append(arr[i]);
			else
				sb.append(arr[i] + "+");
		}
		System.out.println(sb.toString());
	}
}
