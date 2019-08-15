import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int standard = sc.nextInt();
        int[] nums = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num < standard) System.out.print(num + " ");
        }
    }
}