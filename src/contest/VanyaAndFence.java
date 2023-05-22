package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VanyaAndFence {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = bf.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		String[] heights = bf.readLine().split(" ");
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			int kid = Integer.parseInt(heights[i]);
			if (kid <= k)
				count++;
			else
				count += 2;
		}
		System.out.println(count);
	}
}
