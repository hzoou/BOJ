import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println(lcm(a, b, gcd));
    }

    public static int gcd(int a, int b) {
        int result = 0, min = a < b ? a : b;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) result = i;
        }
        return result;
    }

    public static int lcm(int a, int b, int g) {
        return (a / g) * (b / g) * g;
    }
}