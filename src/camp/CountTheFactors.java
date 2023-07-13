package camp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountTheFactors {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String win = "";
        while ((input = bf.readLine()) != null && !(input.length() <= 0)) {
            int a = Integer.parseInt(input);
            if (a == 0) {
                break;
            }
            int resultado = solve(a);
            win += a + " : " + resultado + "\n";
        }
        System.out.print(win);

    }

    public static int solve(int n) {
        Set<Integer> factors = new HashSet<>();
        int i = 2;

        while (i * i <= n) {
            if (n % i != 0) {
                i++;
            } else {
                n /= i;
                factors.add(i);
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors.size();
    }
}
