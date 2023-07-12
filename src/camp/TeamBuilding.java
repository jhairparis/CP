package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeamBuilding {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String win = "";
		for (int i = 0; i < n; i++) {
			String[] val = bf.readLine().split(" ");
			long a = Long.parseLong(val[0]);
			long b = Long.parseLong(val[1]);
			long c = Long.parseLong(val[2]);

			if (i == n - 1)
				win += (Math.min((a + b + c) / 3, Math.min(a + b, Math.min(b + c, c + a))));
			else
				win += (Math.min((a + b + c) / 3, Math.min(a + b, Math.min(b + c, c + a)))) + "\n";
		}

		System.out.println(win);
	}

}
