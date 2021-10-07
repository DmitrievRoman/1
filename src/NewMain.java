import java.io.*;
import java.util.Scanner;
import java.util.function.Predicate;

public class NewMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        double d = 0.0;
        try {
            while (scanner.hasNext()) {
                String exit = scanner.next();
                if(exit.equals("exit")) {
                    break;
                }
                double a = Double.parseDouble(exit);
                d+=a;
            }
        } catch (Exception e) {

        }
        System.out.printf("%.6f",d);
    }
}
