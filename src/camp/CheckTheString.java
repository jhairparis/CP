package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckTheString {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] s = bf.readLine().toCharArray();

		int a = 0;
		int b = 0;
		int c = 0;

		if (s[0] != 'a') {
			System.out.println("NO");
			return;
		}

		for (int i = 0; i < s.length; i++) {
			Character v = s[i];
			if (v == 'a') {
				if ((a != 0 && b != 0)) {
					System.out.println("NO");
					return;
				}
				a++;
			}
			if (v == 'b' && a > 0) {
				if (c >= 1) {
					System.out.println("NO");
					return;
				}
				b++;
			}
			if (v == 'c') {
				if (b == 0) {
					System.out.println("NO");
					return;
				}
				c++;
			}
		}

		if ((c == a || c == b || (c == a && c == b)) && c >= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
