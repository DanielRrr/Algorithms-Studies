import java.io.*;

public class Main {
    public static void toUnix(InputStream input, OutputStream out) throws IOException {
        int read = input.read();
        int past_read = read;
        while (read != -1) {
            read = input.read();
            if (!(past_read == 13 && read == 10)) {
                out.write(past_read);
            }
         past_read = read;
    }
  }
    public static void main(String[] args) {
        try {
            toUnix(System.in, System.out);
            System.out.flush();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
