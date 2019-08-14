import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        for (int i = 0; i < cnt; i++) {
            String nums[] = bf.readLine().split(" ");
            int sum = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
            bw.write("Case #" + (i + 1) + ": " + nums[0] + " + " + nums[1] + " = "+ sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}