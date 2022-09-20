
import java.util.Scanner;
import javax.swing.JOptionPane;

class calculator{

    public static void main(String[] args) {

        // variablen
        double num1;
        double num2;
        String method;

        // inputs
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first digit:");
        num1 = input.nextDouble();
        System.out.println("enter the _xXcalculatingGHGXx_ method:");
        method = input.next();
        System.out.println("enter the second digit:");
        num2 = input.nextDouble();

        // operation
        if (method.equals("+")) {
            System.out.println("the result is: " + (num1 + num2));
        }
        if (method.equals("-")) {
            System.out.println("the result is: " + (num1 - num2));
        }
        if (method.equals("*")) {
            System.out.println("the result is: " + (num1 * num2));
        }
        if (method.equals("/")) {
            if (num2 == 0) {
                System.out.println("du bist halt so dumm");
                System.exit(0);
            }

            else {
                System.out.println("the result is: " + (num1 / num2));
            }
        }
        if (method.equals("%")) {
            int value1 = (int) num1;
            int value2 = (int) num2;
            System.out.println("the result is: " + (value1 % value2));
        }

        // thank you message
        System.out.println("thank you for wasting your time :)");

    }
}