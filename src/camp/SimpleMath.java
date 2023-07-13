package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleMath {

	public static void main(String[] args) throws Exception {
		final long mod = 998244353;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split(" ");

		long A = Long.parseLong(input[0]);
		long B = Long.parseLong(input[1]);
		long C = Long.parseLong(input[2]);

		A = A % mod;
		B = B % mod;
		C = C % mod;

		A = (A * (A + 1) / 2) % mod;
		B = (B * (B + 1) / 2) % mod;
		C = (C * (C + 1) / 2) % mod;

		long ans1 = ((A % mod) * (B % mod) % mod);

		long ans = ((ans1 % mod) * (C % mod) % mod);

		System.out.println(ans);
	}
}
