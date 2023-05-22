package contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

//T - Is your horseshoe on the other hoof?
public class Horseshoe {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] lines = bf.readLine().split(" ");
		HashSet<Integer> ht = new HashSet<Integer>();
		for (int i = 0; i < lines.length; i++)
			ht.add(Integer.parseInt(lines[i]));
		System.out.println(Math.abs(ht.size() - 4));
	}
}
