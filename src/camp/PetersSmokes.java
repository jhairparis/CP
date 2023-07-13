package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PetersSmokes{

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String nkx;
		String win = "";
		while ((nkx = bf.readLine()) != null && !(nkx.length() <= 0)) {
			String[] nk = nkx.split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);

			int dived = 0;
			int mod = 0;
			int aux = n;

			for (int i = 0; n >= k; i++) {
				dived = n / k;
				mod = n % k;
				aux = aux + dived;
				n = dived + mod;
			}

			win += aux + "\n";
		}

		System.out.print(win);
	}

}
