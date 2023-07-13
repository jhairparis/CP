package camp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class i500 {
	static BigInteger save[] = new BigInteger[1001];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer win = new StringBuffer();
	static String line;

	public static void main(String[] args) throws IOException {
		line = br.readLine();
		while (line != null && !line.equals("")) {
			int n = Integer.parseInt(line);
			win.append(n + "!\n" + fact(n) + "\n");
			line = br.readLine();
		}
		System.out.print(win);
	}

	static BigInteger fact(int n) {
		if (save[n] == null) {
			if (n == 0)
				save[0] = new BigInteger("1");
			else {
				save[n] = new BigInteger(Integer.toString(n)).multiply(fact(n - 1));
			}
		}
		return save[n];
	}
}