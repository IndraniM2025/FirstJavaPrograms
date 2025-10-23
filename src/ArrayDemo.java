import java.util.Stack;
import java.util.Scanner;

public class ArrayDemo {

    public static void main (String[] args)
    {
        // scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // size is fixed

        System.out.println("Enter the elements of the array !");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing the array : ");

       for (int i = 0 ; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
