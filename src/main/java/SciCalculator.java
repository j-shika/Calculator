import java.lang.Math;
import java.util.InputMismatchException;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SciCalculator {

    private double num1, num2;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logg = LogManager.getLogger(SciCalculator.class);

    public static double sqrt(int n){
      logg.info("Square Root of : " + n + "\n Result : " + Math.sqrt(n));
        return Math.sqrt(n);
    }

    public static void main(String[] args) {

        SciCalculator Scicalculator = new SciCalculator();

        System.out.println("Executing Scientific Calculator : DevOps Mini Project");
        int ch;
        boolean Boolflag=true;
        while(Boolflag){
            System.out.println("1. Square root\n2. Factorial\n3. Natural Logarithm\n4. Power Function\n5. Exit");
            System.out.println("Choose an option: ");

            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {

                logg.error("[ERROR]: Value type mismatch. Enter Integer type only");

                System.out.print("Enter input in decimals");
                return;

            }
            switch (ch) {
                case 1:

                    System.out.print("\nEnter number for calculating square root: ");
                    Scicalculator.num1 = scanner.nextDouble();

                    if(Scicalculator.num1 < 0)
                    {
                        System.out.println("Enter positive value\n");
                        logg.error("[ERROR]: Square root is not defined for Negative numbers");
                    }
                    else
                        System.out.println("Square root " + Scicalculator.num1 + " is: " + SqaureRootFunc(Scicalculator.num1));
                    break;

                case 2:

                    try {
                        System.out.print("\nEnter number: ");
                        Scicalculator.num1 = scanner.nextInt();

                        if (Scicalculator.num1 < 0)
                        {
                            System.out.println("You have entered a negative value. Factorial cannot be calculated for negative value\n");
                            logg.error("[ERROR]: Factorial of negative numbers does not exists");

                            Boolflag=false;
                        }
                        else
                            System.out.println("The Factorial of " + Scicalculator.num1 + " is: " + Factorialfunc(Scicalculator.num1));

                    } catch (InputMismatchException error) {
                        System.out.println("Enter input in integer format");
                        logg.error("[ERROR]: Value type mismatch. Expected Integer type. ");

                        Boolflag=false;
                    }

                    break;

                case 3:

                    try {
                        System.out.print("\nEnter number: ");
                        Scicalculator.num1 = scanner.nextDouble();
                        if (Scicalculator.num1 <= 0)
                            System.out.println("You have entered either 0 or negative value. Logarithm cannot be calculated for such values\n");
                        else
                            System.out.println("Natural logarithm of " + Scicalculator.num1 + " is: " + LogarithmFunc(Scicalculator.num1));
                    } catch (InputMismatchException error) {
                        System.out.println("Enter input in decimal format");
                        logg.error("[ERROR]: Value type mismatch. Expected Double. ");
                        Boolflag=false;
                    }
                    break;

                case 4:

                    try {
                        System.out.print("\nEnter first number: ");
                        Scicalculator.num1 = scanner.nextDouble();
                        System.out.print("\nEnter second number: ");
                        Scicalculator.num2 = scanner.nextDouble();

                        System.out.println(Scicalculator.num1 + " to the power " + Scicalculator.num2 + " is: " + PowerFunc(Scicalculator.num1, Scicalculator.num2));
                    } catch (InputMismatchException error) {
                        System.out.println("Please enter input in decimal format");
                        logg.error("[ERROR]: Value type mismatch. Expected integers got some other type. ");
                        Boolflag=false;
                    }
                    break;
                default:
                    System.out.println("\nExiting....\n");
                    return;
            }
        }
    }
    public static double SqaureRootFunc(double n)
    {
        logg.info("[INFO]: input for Square Root: " + n);
        logg.info("[INFO]: output of Square Root: " + Math.sqrt(n));
        return Math.sqrt(n);
    }

    public static double LogarithmFunc(double n)
    {
        logg.info("[INFO]: input for Natual Logarithm: " + n);
        logg.info("[INFO]: output of Natual Logarithm: " + Math.log(n));
        return Math.log(n);
    }

    public static double PowerFunc(double n1, double n2)
    {
        logg.info("[INFO]: input for power function: " + n1 + " , "+ n2);

        if(n1==0 && n2==0)
        {
            logg.info("[INFO]: output of power function: " + Double.NaN);
            return Double.NaN;
        }

        logg.info("[INFO]: output of power function: " + Math.pow(n1, n2));
        return Math.pow(n1, n2);
    }

    public static double Factorialfunc(double n)
    {

        logg.info("[INFO]: Input for Factorial function: " + n);
        double res=1;

        if(n <0 )
            return Double.NaN;

        while(n!=0)
        {
            res=res*n;
            n--;
        }
        logg.info("[INFO]: output of Factorial function: "+ res);
        return res;
    }
}