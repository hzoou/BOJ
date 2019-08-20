import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (checker(word)) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean checker(String v) {
        int[] alpha = new int[26];
        for (int i = 0; i < alpha.length; i++)  alpha[i] = -1;
        for (int i = 0; i < v.length(); i++) {
            int idx = v.charAt(i) - 97;
            if (alpha[idx] == -1) alpha[idx] = i;
            else {
                if (alpha[idx] + 1 == i) alpha[idx] = i;
                else return false;
            }
        }
        return true;
    }
}