package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Keyboardd {
	public static void main(String args[]) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] main = bf.readLine().toCharArray();
		char[] compare = bf.readLine().toCharArray();
		String win = "";

		HashMap<Character, Integer> ht2 = new HashMap<>();
		HashMap<Character, Integer> ht = new HashMap<>();

		for (int i = 0; i < main.length; i++) {
			char h = main[i];
			if (ht.get(h) == null)
				ht.put(h, 1);
			else
				ht.put(h, ht.get(h) + 1);

		}

		for (int i = 0; i < compare.length; i++) {
			if (ht2.get(compare[i]) == null) {
				ht2.put(compare[i], 1);
			} else {
				ht2.put(compare[i], ht2.get(compare[i]) + 1);
			}
		}

		for (Character key : ht.keySet()) {
			int x = ht.get(key);
			int y = ht2.get(key);
			if (x < y)
				win += key;
		}

		System.out.print(win);
	}

}
