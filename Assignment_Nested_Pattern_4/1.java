import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        char b = (char) isr.read();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    System.out.print(b + "" + a + " ");
                    a--;
                    b--;
                }

                else {
                    // System.out.print(b+""+a+" ");
                    a++;
                    b++;
                    System.out.print(b + "" + a + " ");
                }
            }
            System.out.println();
        }
    }
}
