package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A. Domino piling
public class DominoPiling {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String Mn = bf.readLine();
		StringTokenizer st = new StringTokenizer(Mn);

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		System.out.println((int) ((m * n) / 2));
	}

}
