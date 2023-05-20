
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Bit++
public class BitPlusPlus {

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(sc.readLine());
		int x = 0;
		for (int i = 0; i < n; i++) {
			String op = sc.readLine();

			if (op.contains("-"))
				x = x - 1;
			if (op.contains("+"))
				x = x + 1;
		}
		System.out.println(x);
		sc.close();
	}
}
