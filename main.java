package java_calculator;
import java.util.Scanner;
import javax.swing.JOptionPane;

class calculator
{
    public static void main(String[] args) {

        int num1;
        int num2;
        String method;


        Scanner input = new Scanner(System.in);
        System.out.println("enter the first digit:");
        num1 = input.nextInt();

        System.out.println("enter the calculatingh method:");
        method = input.next();

        System.out.println("enter the second digit:");
        num2 = input.nextInt();

        System.out.println("calculating...");

        if (method.equals("+")) {
            System.out.println("the result is: "+ (num1 + num2));
        }

        if (method.equals("-")) {
            System.out.println("the result is: "+ (num1 - num2));
        }

        if (method.equals("*")) {
            System.out.println("the result is: "+ (num1 * num2));
        }

        if (method.equals("/")) {
            System.out.println("the result is: "+ (num1 / num2));
        }
        
        System.out.println("thank you for using my code :)");

    }
}