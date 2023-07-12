package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameShopping {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = bf.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int m = Integer.parseInt(nk[1]);
		String[] games = bf.readLine().split(" ");
		String[] wallet = bf.readLine().split(" ");

		int countBuy = 0;
		int wPlus = 0;
		boolean stop = false;
		for (int i = 0; i < games.length; i++) {
			int g = Integer.parseInt(games[i]);

			if (stop) {
				System.out.println(countBuy);
				return;
			}

			int w = Integer.parseInt(wallet[wPlus]);

			if (w >= g) {
				countBuy = countBuy + 1;
				wPlus = wPlus + 1;
				if (wPlus == m)
					stop = true;
			}
		}
		System.out.println(countBuy);
	}
}
