import java.util.Scanner;
public class LCMGCD {
    public static void main(String[] args) {
        int a, b, lcm, gcd;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Two Number");
        a = scanner.nextInt();
        b = scanner.nextInt();

        gcd = GCD(a, b);
        lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
