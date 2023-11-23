package tic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class palabra2 {

    public static String solve(String text) {
        Map<String, Integer> frequencies = new HashMap<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
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
