import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiceGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int sum1 = 0;
        while (st.hasMoreTokens()) {
            sum1 += Integer.parseInt(st.nextToken());
        }

        int sum2 = 0;
        s = br.readLine();
        st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            sum2 += Integer.parseInt(st.nextToken());
        }

        if (sum1 > sum2) {
            System.out.println("Gunnar");
        } else if (sum1 < sum2) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
    }
}
