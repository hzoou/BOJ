import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String mun1 = "", mun2 = "";
        for (int i = 2; i >= 0; i--) {
            mun1 += num1.charAt(i);
            mun2 += num2.charAt(i);
        }
        String result = (Integer.parseInt(mun1) > Integer.parseInt(mun2)) ? mun1: mun2;
        System.out.println(result);
    }
}