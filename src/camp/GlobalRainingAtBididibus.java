package camp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GlobalRainingAtBididibus {
	public class Main {

		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		static StringBuffer sb = new StringBuffer();

		public static void main(String[] args) throws IOException {
			long t = Long.parseLong(br.readLine());
			for (long i = 0; i < t; i++) {
				int h = 0, water = 0;
				String line = br.readLine();
				HashMap<Integer, Integer> height = new HashMap<>();
				for (int j = 0; j < line.length(); j++) {
					if (line.charAt(j) == '\\') {
						height.put(h, j);
						h--;
					} else if (line.charAt(j) == '/') {
						h++;
						if (height.containsKey(h)) {
							water += (j - height.get(h));
							height.remove(h);
						}
					}
				}
				sb.append(water + "\n");
			}
			System.out.print(sb);
		}
	}
}
