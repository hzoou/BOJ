import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int[] call = new int[input.length];
        int i = 0;
        for (char alpha : input) {
            int num = ((int) alpha) - 65;
            if (num < 3)    call[i++] = 3;
            else if (num < 6)   call[i++] = 4;
            else if (num < 9)   call[i++] = 5;
            else if (num < 12)   call[i++] = 6;
            else if (num < 15)   call[i++] = 7;
            else if (num < 19)   call[i++] = 8;
            else if (num < 22)   call[i++] = 9;
            else    call[i++] = 10;
        }

        int result = 0;
        for (int t : call)  result += t;
        System.out.println(result);
    }
}