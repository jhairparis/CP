package tic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class palabra1 {

  public static String solve(String text) {
    Map<String, Integer> frequencies = new HashMap<>();
    String[] words = text.split("\\s+");

    for (String word : words) {
      if (frequencies.containsKey(word)) {
        int f = frequencies.get(word) + 1;
        frequencies.put(word, f);
      } else {
        frequencies.put(word, 1);
      }
    }

    int maxFrequency = 0;
    String bestWord = "";

    for (Map.Entry<String, Integer> input : frequencies.entrySet()) {
      String word = input.getKey();
      int f = input.getValue();

      if (f > maxFrequency) {
        maxFrequency = f;
        bestWord = word;
      }
    }

    return bestWord;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    String text = sc.readLine();
    System.out.println(solve(text));
  }
}
