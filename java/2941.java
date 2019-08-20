import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for (String cro : croatia) {
            if (input.contains(cro)) input = input.replace(cro, "*");
        }
        System.out.println(input.length());
    }
}