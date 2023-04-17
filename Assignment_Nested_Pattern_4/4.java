import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter starting range: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter ending range; ");
        int b = Integer.parseInt(br.readLine());
        // even in reverse
        int s = a;
        int r = b;
        while (r >= a) {
            if (r % 2 == 0) {
                System.out.print(r + " ");
            }
            r--;
        }
        System.out.println();
        while (s <= b) {
            if (s % 2 != 0) {
                System.out.print(s + " ");

            }
            s++;
        }

    }
}
