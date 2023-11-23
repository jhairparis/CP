package tic;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hora {
	public static String solve(int hours, int minutes, int seconds) {
		if (hours == 12) {
			hours = 0;
		}

		int totalSeconds = hours * 3600 + minutes * 60 + seconds;

		int blars = totalSeconds / 10000;
		int blers = (totalSeconds % 10000) / 1000;
		int blirs = (totalSeconds % 1000) / 100;
		int blors = (totalSeconds % 100) / 10;
		int blurs = totalSeconds % 10;

		String s = blars + ":" + blers + ":" + blirs + ":" + blors + ":" + blurs;

		return s;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String[] hms = sc.readLine().split(":");
		int hours = Integer.parseInt(hms[0]);
		int minutes = Integer.parseInt(hms[1]);
		int seconds = Integer.parseInt(hms[2]);

		System.out.println(solve(hours, minutes, seconds));
	}
}
