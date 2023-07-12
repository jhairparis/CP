package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WalkingBoy {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String win = "";
		for (int i = 0; i < n; i++) {
			int count = 0;

			int k = Integer.parseInt(bf.readLine());

			String[] hours = bf.readLine().split(" ");

			for (int j = 0; j < hours.length; j++) {
				int item = Integer.parseInt(hours[j]);
				if (j == 0) {
					if (item >= 240)
						count = count + 2;
					else if (item >= 120)
						count = count + 1;
				}
				if (!(j + 1 < k)) {
					if (item <= 1200)
						count = count + 2;
					else if (item <= 1320 && count > 0)
						count++;
					break;

				} else {
					int itemNext = Integer.parseInt(hours[j + 1]);

					if (((item - itemNext) * -1) >= 240)
						count = count + 2;
					else if (((item - itemNext) * -1) >= 120)
						count++;
				}

			}

			if (count >= 2)
				win += "YES" + "\n";
			else if (count < 2)
				win += "NO" + "\n";
		}

		System.out.println(win);
	}
}
/*
6
14
100 200 300 400 500 600 700 800 900 1000 1100 1200 1300 1400
2
100 200 300 400 600 700 800 900 1100 1200 1300 1400
13
100 200 300 400 500 600 700 800 900 1100 1200 1300 1400
13
101 189 272 356 463 563 659 739 979 1071 1170 1274 1358
1
42
5
0 1 2 3 4
 */