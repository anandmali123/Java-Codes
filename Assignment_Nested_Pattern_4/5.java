import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int prev = Integer.parseInt(br.readLine());
        int next = Integer.parseInt(br.readLine());
        int curr = prev + next;
        System.out.print("Enter size: ");
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(prev + " ");
                prev = next;
                next = curr;
                curr = prev + next;
            }
            System.out.println();
        }
    }
}
