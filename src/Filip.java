import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Filip {
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nk = new StringTokenizer(sc.readLine());
		String As = new StringBuilder(nk.nextToken()).reverse().toString();
		String Bs = new StringBuilder(nk.nextToken()).reverse().toString();

		int a = Integer.parseInt(As);
		int b = Integer.parseInt(Bs);

		if (a > b) {
			System.out.println(As);
		} else {
			System.out.println(Bs);
		}

	}
}
