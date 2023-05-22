package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class CompilationErrors {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		String[] firstLine = bf.readLine().trim().split(" ");
		String[] secondLine = bf.readLine().trim().split(" ");
		String[] thirdLine = bf.readLine().trim().split(" ");

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		Hashtable<String, Integer> ht2 = new Hashtable<String, Integer>();

		for (int i = 0; i < firstLine.length; i++) {
			String x = firstLine[i];

			if (ht.get(x) == null) {
				ht.put(x, 0);
				ht2.put(x, 0);
			} else {
				int last = ht.get(x);
				last++;
				ht.put(x, last);
				ht2.put(x, last);
			}
		}

		for (int i = 0; i < secondLine.length; i++) {
			String b = secondLine[i];

			if (ht.get(b) == null)
				continue;

			if (ht.get(b) > 0) {
				ht.put(b, ht.get(b) - 1);
			} else if (ht.get(b) == 0)
				ht.remove(b);
		}

		for (int i = 0; i < thirdLine.length; i++) {
			String c = thirdLine[i];

			if (ht2.get(c) == null)
				continue;

			if (ht2.get(c) > 0) {
				ht2.put(c, ht2.get(c) - 1);
			} else if (ht2.get(c) == 0)
				ht2.remove(c);
		}

		String r1 = ht.keySet().iterator().next();

		if (ht2.get(r1) == 0)
			ht2.remove(r1);
		else
			ht2.put(r1, ht2.get(r1) - 1);

		String r2 = ht2.keySet().iterator().next();

		System.out.println(r1);
		System.out.println(r2);

	}
}
