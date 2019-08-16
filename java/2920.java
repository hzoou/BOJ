import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        String result = "";
        for (int i = 0; i < 8; i++) {
            nums[i] = sc.nextInt();
        }

        if (nums[0] == 1) {
            int i = 0;
            while (i != 7) {
                if (++nums[i] != nums[++i]) {
                    result = "mixed";
                    break;
                }
                result = "ascending";
            }
        } else if (nums[0] == 8) {
            int i = 0;
            while (i != 7) {
                if (--nums[i] != nums[++i]) {
                    result = "mixed";
                    break;
                }
                result = "descending";
            }
        } else {
            result = "mixed";
        }
        System.out.println(result);
    }
}