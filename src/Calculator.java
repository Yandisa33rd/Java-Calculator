import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Basic Calculator");
        System.out.println("Please choose a function");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        Scanner funcOption = new Scanner(System.in);
        int func = funcOption.nextInt();
        if (func == 1){
            Addition();
            main(args);
        }
        else if (func == 2) {
            Subtraction();
            main(args);
        }
        else if (func == 3) {
            Multiplication();
            main(args);
        }
        else if (func == 4) {
            Division();
            main(args);
        }
        else if (func == 5) {
            System.exit(5);
        }
    }

    public static void Addition() { //Addition function
        System.out.println("Addition:\nFirst value: ");
        Scanner numChoice  = new Scanner(System.in);
        double addNum1 = numChoice.nextInt();
        System.out.println("Enter your second value");
        double addNum2 = numChoice.nextInt();
        double value = (addNum1 + addNum2);
        System.out.println(addNum1+ " plus "+ addNum2 + " equals " + value);

    }

    public static void Subtraction() { // Subtraction function
        System.out.println("Subtraction:\nFirst value: ");
        Scanner numChoice  = new Scanner(System.in);
        double subNum1 = numChoice.nextInt();
        System.out.println("second value");
        double subNum2 = numChoice.nextInt();
        double value = (subNum1 - subNum2);
        System.out.println(subNum1+ " minus "+ subNum2 + " equals " + value);
    }

    public static void Multiplication() { // Subtraction function
        System.out.println("Multiplication:\nFirst value: ");
        Scanner numChoice  = new Scanner(System.in);
        double multNum1 = numChoice.nextInt();
        System.out.println("second value");
        double multNum2 = numChoice.nextInt();
        double value = (multNum1 * multNum2);
        System.out.println(multNum1+ " multiplied by "+ multNum2 + " equals " + value);

    }

    public static void Division(){ //Division function
        System.out.println("Division selected:\n First value: ");

            Scanner numChoice = new Scanner(System.in);
            int diviNum1 = numChoice.nextInt();
            System.out.println("second value");
            int diviNum2 = numChoice.nextInt();
            try {
                int value = (diviNum1 / diviNum2);
                System.out.println(diviNum1 + " divided by " + diviNum2 + " equals " + value);
            } catch (ArithmeticException e){
                System.out.println(e);
            }
    }
}