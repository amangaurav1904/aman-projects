import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter number which has to checked prime or not");
        double a = in.nextDouble();
        if (a <= 1) {
            System.out.println("Number cannot be determined as prime or not");
        } else {
            double u = 0;
            for (double i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    u++;
                } else {
                    u = u;
                }

                if (u != 0) {
                    break;
                }
            }
            if (u != 0) {
                System.out.println("Number is non prime");

            } else {
                System.out.println("Number is prime");
            }
        }
    }
}