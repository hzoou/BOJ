import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int[] cnts = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < 3; i++) num *= sc.nextInt();
        while (num != 0) {
            cnts[num % 10]++;
            num /= 10;
        }
        for (int cnt : cnts) System.out.println(cnt);
    }
}