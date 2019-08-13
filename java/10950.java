import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] nums = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 2; j++) {
                nums[i] += sc.nextInt();
            }
        }
        for (int num : nums) System.out.println(num);
    }
}