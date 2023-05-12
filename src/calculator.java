import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, e;
        a = in.nextInt();
        b = in.nextInt();
        e = in.nextInt();
        char c = in.next().charAt(0);
        char d = in.next().charAt(0);
        switch (c) {
            case '+':
                switch (d) {
                    case '+':
                        System.out.println(a + b + e);
                        break;
                    case '-':
                        System.out.println(a + b - e);
                        break;
                    case '*':
                        System.out.println(a + b * e);
                        break;
                    case '/':
                        System.out.println(a + b / e);
                        break;
                    case '%':
                        System.out.println(a + b % e);
                        break;
                    default:
                        System.out.println("Enter valid operator bro");
                }
                break;
            case '-':
                switch (d) {
                    case '+':
                        System.out.println(a - b + c);
                        break;
                    case '-':
                        System.out.println(a - b - c);
                        break;
                    case '*':
                        System.out.println(a - b * c);
                        break;
                    case '/':
                        System.out.println(a - b / c);
                        break;
                    case '%':
                        System.out.println(a - b % c);
                        break;
                    default:
                        System.out.println("Enter valid operator bruh");
                }
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enter valid operator");
        }
    }
}
// create a calculator which follows bodmas rule