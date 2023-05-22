package contest;
import java.util.Scanner;

public class Jumping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		if (cases > 30) {
			sc.close();
			return;
		}

		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i < cases; i++) {
			int n_wall = Integer.parseInt(sc.next());

			if (n_wall <= 0 || n_wall >= 50) {
				sc.close();
				sc2.close();
				return;
			}

			String walls = sc2.nextLine();
			walls = walls.replaceAll(" ", "");

			int h = 0;
			int l = 0;

			for (int j = 0; j < n_wall; j++) {
				int current = Integer.parseInt(walls.charAt(j) + "");

				if (current > 10) {
					sc.close();
					sc2.close();
					System.out.println("Hey!");
					return;
				}

				int next = 0;
				if (j + 1 < n_wall) {
					next = Integer.parseInt(walls.charAt(j + 1) + "");
				}

				if (next > current) {
					h++;
				}

				if (next < current) {
					if (j == n_wall - 1) {
						continue;
					}
					l++;
				}
			}
			System.out.println("Case " + (i + 1) + ": " + h + " " + l);
		}
		sc.close();
		sc2.close();
	}
}
