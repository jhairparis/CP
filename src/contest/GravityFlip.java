package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//Gravity Flip
public class GravityFlip {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] boxes = bf.readLine().trim().split(" ");

		Arrays.sort(boxes);

		StringBuilder s = new StringBuilder();
		for (String element : boxes) {
			s.append(" " + element);
		}
		System.out.println(s.toString().trim());

	}
}
