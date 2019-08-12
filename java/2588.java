import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum = 0, unit = 1;
        a = sc.nextInt();
        b = sc.nextInt();

        while (b != 0) {
            System.out.println((b % 10) * a);
            sum += (b % 10) * a * unit;
            b /= 10;
            unit *= 10;
        }
        System.out.println(sum);
    }
}