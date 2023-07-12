package camp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterPatterns {
	static String braker = "";

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		String win = "";
		for (int i = 0; i < n; i++) {
			braker = "";
			String[] val = bf.readLine().split(" ");
			int division = Integer.parseInt(val[0]);
			int alturaDeDivision = Integer.parseInt(val[2]);
			int columnaPunto = Integer.parseInt(val[1]);
			int anchuraPunto = Integer.parseInt(val[3]);

			win += division(alturaDeDivision, division, row(anchuraPunto, columnaPunto)) + "\n";
		}
		System.out.println(win);
	}

	public static String row(int anchuraPunto, int columnaPunto) {
		String a_a = "*";
		for (int j = 0; j < columnaPunto; j++) {
			for (int i = 0; i < anchuraPunto; i++) {
				a_a += ".";
			}
			a_a += "*";
		}

		for (int i = 0; i < a_a.length(); i++)
			braker += "*";

		return a_a;
	}

	public static String division(int alturaDeDivision, int division, String fila) {
		String altura = braker + "\n";
		for (int j = 0; j < division; j++) {
			for (int i = 0; i < alturaDeDivision; i++) {
				if (i == alturaDeDivision - 1)
					altura += fila;
				else
					altura += fila + "\n";
			}

			if (j == division - 1)
				altura += "\n" + braker;
			else
				altura += "\n" + braker + "\n";
		}
		return altura;
	}

}
