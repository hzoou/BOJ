import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int sum = 0;
        String result = "";
        for (int i = s; i <= e; i++) {
            if (i != 1) {
                if (prime(i)) {
                    sum += i;
                    result += i + " ";
                }
            }
        }
        if (sum == 0) System.out.println(-1);
        else System.out.println(sum + "\n" + result.split(" ")[0]);
    }

    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}