import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] answers = new String[n];
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            String[] o = Arrays.stream(answers[i].split("X")).filter(el -> !el.equals("")).toArray(String[]::new);
            for (int j = 0; j < o.length; j++) {
                scores[i] += getScore(o[j].length());
            }
        }
        for (int score : scores) System.out.println(score);
    }

    public static int getScore(int n) {
        int score = 0;
        for (int i = 1; i <= n; i++) {
            score += i;
        }
        return score;
    }
}