public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10001];
        for (int i = 1; i <= 10000; i++) {
            int self = getSelf(i);
            if (self <= 10000) nums[self] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 1) System.out.println(i);
        }
    }

    public static int getSelf(int n) {
        int ans = n;
        for (int i = 0; i < (n+"").length(); i++) {
            ans += Character.getNumericValue((n+"").charAt(i));
        }
        return ans;
    }
}