import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = a - 2;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int s = a;
            for (int j = 0; j < n - i; j++) {
                System.out.print(a + " ");
                a = a - (i + 1);
            }
            a = s;
            a = a + b;
            b = b - 2;
            System.out.println();
        }
    }
}
