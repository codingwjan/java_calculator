<<<<<<< HEAD
package java_calculator;

=======
>>>>>>> 67c5d9bdf7b8abe5c9eaaf3b221db96859ff5848
import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

<<<<<<< HEAD
class calculator {

    public static void main(String[] args) throws IOException, URISyntaxException {

        try {
            // variables
=======
class calculator  {

    public static void main(String[] args) throws IOException, URISyntaxException {

        try {

            // variablen
>>>>>>> 67c5d9bdf7b8abe5c9eaaf3b221db96859ff5848
            double num1;
            double num2;
            String operator;

<<<<<<< HEAD
            // input
=======
            // inputs
>>>>>>> 67c5d9bdf7b8abe5c9eaaf3b221db96859ff5848
            Scanner input = new Scanner(System.in);
            System.out.println("enter the first digit:");
            num1 = input.nextDouble();
            System.out.println("enter the mathematical operator:");
            operator = input.next();
            System.out.println("enter the second digit:");
            num2 = input.nextDouble();

            // operation
            if (operator.equals("+")) {
                System.out.println("the result is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("the result is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("the result is: " + (num1 * num2));
            } else if (operator.equals("/")) {
                if (num2 == 0) {
<<<<<<< HEAD
                    System.out.println("you can't devide by zero");
=======
                    System.out.println("geht nicht");
>>>>>>> 67c5d9bdf7b8abe5c9eaaf3b221db96859ff5848
                }

                else {
                    System.out.println("the result is: " + (num1 / num2));
                }
            } else if (operator.equals("%")) {
                int value1 = (int) num1;
                int value2 = (int) num2;
                System.out.println("the result is: " + (value1 % value2));
            }

            else {
                Desktop.getDesktop().browse(new URI("i think you made a critacal error with the operator"));
            }

            // thank you message
            System.out.println("thanks for running my code");

        } catch (Exception e) {
            System.out.println("hmmmmmmmmmmmmm something went wrong");
        }

    }
}