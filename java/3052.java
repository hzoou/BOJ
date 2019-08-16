import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnts = new int[42];
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            cnts[n % 42]++;
        }
        int[] result = Arrays.stream(cnts).filter(cnt -> cnt != 0).toArray();
        System.out.println(result.length);
    }
}