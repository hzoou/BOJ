import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] prime = new int[n+1];
        prime[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; i * j <= n; j++) prime[i*j] = 1;
        }
        for (int i = m; i <= n; i++) if (prime[i] != 1) System.out.println(i);
    }
}