import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        char result = ' ';
        int[] alpha = new int[26];
        char[] input = sc.next().trim().toUpperCase().toCharArray();
        for (int i = 0; i < input.length; i++) alpha[((int) input[i]) - 65]++;
        for (int i = 0; i < alpha.length; i++) {
            if (max < alpha[i]) {
                result = (char) (i + 65);
                max = alpha[i];
            }
            else if (max == alpha[i]) result = '?';
        }
        System.out.println(result);
    }
}