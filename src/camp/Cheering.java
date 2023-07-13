package camp;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cheering {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] t = bf.readLine().toCharArray();

		int a_count = 0;
		int b_count = 0;

		for (int i = 0; i < t.length; i++) {
			int len = t.length - 1;
			if (i + 1 > len || i + 2 > len) {
				break;
			}
			char L = t[i];
			char S = t[i + 1];
			char C = t[i + 2];

			if (L == 'L' && S == 'S' && C == 'C') {
				a_count++;
			}

			if (i + 3 > len) {
				break;
			}

			char P = t[i];
			char C2 = t[i + 1];
			char M = t[i + 2];
			char S2 = t[i + 3];

			if (P == 'P' && C2 == 'C' && M == 'M' && S2 == 'S') {
				b_count++;
			}
		}
		if (a_count > b_count) {
			System.out.println("LSC");
		} else if (a_count < b_count) {
			System.out.println("PCMS");
		} else if (a_count == b_count) {
			System.out.println("Tie");
		}

	}
}
