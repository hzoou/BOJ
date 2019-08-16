import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        double m = score[n-1];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += score[i] / m * 100;
        }
        System.out.println(sum / n);
    }
}