
import java.lang.Math;
import java.util.Scanner;

public class SciCalculator {

//    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double sqrt(int n){
//        logger.info("Calculating Square Root of : " + n + "\n Result : " + Math.sqrt(n));
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("what you want to test\n" +
                    "Press 0 for exit\n" +
                    "Press 1 for Square root function\n" +
                    "Press 2 for Factorial function\n" +
                    "Press 3 for Natural logarithm\n" +
                    "Press 4 for Power function");

            int input = scanner.nextInt();

            switch (input){
                case 0:
                    return;
                case 1:
                    System.out.println("Enter a number for sqrt\n");
                    num = scanner.nextInt();
                    System.out.println(sqrt(num));
            }
        }
    }
}