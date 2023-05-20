
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A. Next Round
 */
public class NextRound {
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nk = new StringTokenizer(sc.readLine());

		int n = Integer.parseInt(nk.nextToken());
		int k = Integer.parseInt(nk.nextToken());

		int result = 0;

		StringTokenizer st = new StringTokenizer(sc.readLine());
		String[] g = new String[n];

		int x = 0;
		while (st.hasMoreTokens())
			g[x++] = st.nextToken();

		int RealK = Integer.parseInt(g[k - 1]);

		for (int i = 0; i < g.length; i++) {
			int value = Integer.parseInt(g[i]);

			if (value >= RealK && value > 0)
				result++;
		}

		System.out.println(result);
	}
}