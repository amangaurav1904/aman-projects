import java.util.*;

public class evenorodd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        int d = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                b++;
            } else {
                d++;
            }
        }
        System.out.println("Number of even numbers " + b);
        System.out.println("Number of odd numbers " + d);
    }
}
