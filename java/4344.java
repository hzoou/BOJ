import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] answers = new double[n];
        for (int i = 0; i < n; i++) {
            int cnt = sc.nextInt();
            int sum = 0;
            int[] scores = new int[cnt];
            for (int j = 0; j < cnt; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }
            double avg = sum / cnt;
            int avgStu = 0;
            for (int j = 0; j < cnt; j++) {
                if (avg < scores[j]) avgStu++;
            }
            answers[i] = (double) avgStu / cnt * 100;
        }

        for (double answer : answers) {
            System.out.println(String.format("%.3f", answer) + "%");
        }
    }
}