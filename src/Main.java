import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        System.out.println("Welcome to MyCalculator");
        System.out.println("***********************************************************************");
        System.out.println("Enter your 1st number : ");
        Scanner S1 = new Scanner(System.in);
        int Num1 = S1.nextInt();
        System.out.println("Enter your 2nd number : ");
        Scanner S2 = new Scanner(System.in);
        int Num2 = S2.nextInt();
        int substraction = calculator.substraction(Num1, Num2);
        System.out.println("Substraction is :" + substraction);
        System.out.println("***********************************************************************");
        int sum = calculator.sum(Num1, Num2);
        System.out.println("Sum is : " + sum);
        System.out.println("***********************************************************************");
        int average = sum/2;
        System.out.println("Average is : " + average);
        System.out.println("***********************************************************************");
        int mul = calculator.multiplication(Num1, Num2);
        System.out.println("Multiplication is : " + mul);
        System.out.println("***********************************************************************");
        double division = calculator.division(Num1, Num2);
        System.out.println("Division is " +division);
        System.out.println("***********************************************************************");

       /*
        Calculator calculator = new Calculator();
        System.out.println("Welcome to MyCalculator");
        System.out.println("***********************************************************************");
        int substraction = calculator.substraction(10,20);
        System.out.println("Substraction of 10 and 20 is " + substraction);
        int sum = calculator.sum(10, 20);
        System.out.println("Sum of 10 and 20 is " + sum);
        int average = sum/2;
    //  int moreSomething = average + 200;
        System.out.println("Average of two nos : " + average);
        int mul = calculator.multiplication(10, 20);
        System.out.println("Multiplication of 10 and 20 is : " + mul);
        double division = calculator.division(10, 20);
        System.out.println("Division of 10 and 20 is " +division);
        */

    }
}
