import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int standard = sc.nextInt();
        int num = (standard % 10) * 10 + (standard / 10 + standard % 10) % 10;
        int cnt = 1;
        while (standard != num) {
            num = (num % 10) * 10 + (num / 10 + num % 10) % 10;
            cnt++;
        }
        System.out.println(cnt);
    }
}