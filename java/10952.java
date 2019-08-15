import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int a = -1;
        int b = -1;
        while (a != 0 && b != 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            result += (a + b) + "\n";
        }
        System.out.println(result.substring(0, result.length()-3));
    }
}