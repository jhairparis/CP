

import java.util.Scanner;

//71A - Way Too Long Words
public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (!(n >= 1 && n <= 100)) {
			sc.close();
			return;
		}

		String[] n_test = new String[n];

		for (int i = 0; i < n_test.length; i++) {
			String t = sc.next();
			n_test[i] = t;
		}

		for (String test : n_test) {
			char[] t1 = test.toCharArray();
			if (t1.length > 10) {
				int x = t1.length - 2;
				StringBuilder sb = new StringBuilder();
				sb.append(test.charAt(0));
				sb.append(x);
				sb.append(test.charAt(t1.length - 1));
				System.out.println(sb);
			} else {
				System.out.println(test);
			}
		}

		sc.close();
	}
}
