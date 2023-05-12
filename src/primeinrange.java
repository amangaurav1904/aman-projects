import java.util.*;

public class primeinrange {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int co = 0;
        int pr = 0;
        int r = in.nextInt();
        for (int w = 2; w < r; w++) {


            int u = 0;
            for (int i = 2; i < w; i++) {
                if (w % i == 0) {
                    u++;
                } else {
                    u = u;
                }
            }
            if (u != 0) {
                co++;

            } else {
                pr++;
            }
        }

        System.out.println("Number of composit " + co);
        System.out.println("number of prime " + pr);
    }
}

