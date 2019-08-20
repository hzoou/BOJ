import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 100) System.out.println(n);
        else {
            int result = 99;
            for (int i = 100; i <= n; i++) result += checkNum(i);
            if (n == 1000)  result--;
            System.out.println(result);
        }
    }

    public static int checkNum(int n) {
        int num1 = n / 100 % 10;
        int num2 = n / 10 % 10;
        int num3 = n % 10;
        return (num2 * 2 == num1 + num3) ? 1 : 0;
    }
}