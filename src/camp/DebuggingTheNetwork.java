package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DebuggingTheNetwork {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			String[] s = bf.readLine().split(" ");

			char[] arr = s[0].toCharArray();
			int max = Integer.parseInt(s[1]);

			StringBuilder win = new StringBuilder();
			String num = "";
			boolean skip = false;

			for (int j = 0; j < arr.length; j++) {
				char value = arr[j];

				if (Character.isDigit(value))
					num += value;
				else if (Character.isAlphabetic(value) && !num.equals("")) {
					Long realNum = Long.parseLong(num.trim());

					if (realNum >= max) {
						skip = true;
						break;
					}
					String subWin = "";
					while (realNum-- > 0) {
						subWin += value;
					}
					if (subWin.length() <= max) {
						win.append(subWin);
					}
					num = "";

				} else {
					win.append(value);
				}
			}
			if (win.toString().length() <= max && !skip) {
				if (i == t - 1)
					sb.append(win);
				else
					sb.append(win + "\n");
			} else {
				if (i == t - 1)
					sb.append("unfeasible");
				else
					sb.append("unfeasible" + "\n");
			}

		}

		System.out.println(sb.toString());
	}
}