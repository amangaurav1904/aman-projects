import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number which has to checked prime or not");
        double a = in.nextDouble();
        if (a <= 1) {
            System.out.println("Number cannot be determined as prime or not");
        } else {
            double u = 0;
            for (double i = 2; i < a; i++) {
                if (a % i == 0) {
                    u++;
                } else {
                    u = u;
                }

                if (u != 0) {
                    break;
                }
            }
            String d=(u!=0)? "Number is non-prime":"Number is prime";
            System.out.println(d);
        }
    }
}
