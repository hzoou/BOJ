import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] nums = sc.next().toCharArray();
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--) System.out.print(nums[i]);
    }
}