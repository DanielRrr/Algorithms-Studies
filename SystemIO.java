import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    double result = 0;
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
        
    while(scanner.hasNext()){
        if(scanner.hasNextDouble()) {
            result += scanner.nextDouble();
        } else {
            scanner.next();
        }
    }
    System.out.printf("%.6f", result);
    }
}
