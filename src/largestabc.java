import java.util.*;

public class largestabc {
    public static void main(String Args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int e = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(e);

    }
}
