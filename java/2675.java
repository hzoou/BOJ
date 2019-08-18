import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cnt = sc.nextInt();
            String value = sc.next();
            for (int j = 0; j < value.length(); j++) {
                char v = value.charAt(j);
                for (int l = 0; l < cnt; l++) {
                    result += v;
                }
            }
            result += "\n";
        }
        System.out.println(result.substring(0, result.length()-1));
    }
}