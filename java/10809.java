import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i ++) alpha[i] = -1;
        char[] input = sc.next().trim().toCharArray();
        for (int i = 0; i < input.length; i++) {
            int ascii = ((int) input[i]) - 97;
            if (alpha[ascii] == -1) alpha[ascii] = i;
        }
        for (int a : alpha) result += a + " ";
        System.out.println(result.substring(0, result.length()-1));
    }
}