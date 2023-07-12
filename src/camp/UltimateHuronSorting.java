package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UltimateHuronSorting {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] elements = bf.readLine().split(" ");
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			int val = Integer.parseInt(elements[i]);
			int position = i + 1;
			if (val == position) {
				count++;
			}
		}
		System.out.println(count);
	}
}
