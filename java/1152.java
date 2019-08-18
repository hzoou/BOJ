import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String answer = bf.readLine().trim();
        if (answer.isEmpty()) System.out.println(0);
        else System.out.println(answer.split(" ").length);
    }
}