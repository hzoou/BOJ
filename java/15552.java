import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        for (int i = 0; i < cnt; i++) {
            String nums[] = bf.readLine().split(" ");
            bw.write(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}