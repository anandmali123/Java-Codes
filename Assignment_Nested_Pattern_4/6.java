import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        char p = (char) isr.read();
        char q = (char) isr.read();
        if (p == q) {
            System.out.println(p + " " + q);
        } else {
            System.out.println(q - p+65);
        }
    }
}
