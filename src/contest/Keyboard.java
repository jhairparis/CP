package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//H - Keyboard
public class Keyboard {
	public static void main(String[] args) throws Exception {
		String dictionary = "qwertyuiop0asdfghjkl;0zxcvbnm,./";
		StringBuilder sb = new StringBuilder();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String instruction = bf.readLine();
		String input = bf.readLine();

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < dictionary.length(); j++) {
				if (input.charAt(i) == dictionary.charAt(j)) {
					if (instruction.charAt(0) == 'R') {
						sb.append(dictionary.charAt(j - 1));
					}
					if (instruction.charAt(0) == 'L') {
						sb.append(dictionary.charAt(j + 1));
					}
				}
			}
		}

		System.out.println(sb.toString());
	}
}
