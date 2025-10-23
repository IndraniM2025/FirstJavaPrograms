import java.util.Scanner;
public class Increement {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(n) : ");
        int Increment = scanner.nextInt();
        int count = 0;
        int evennum = 2;
        int oddnum = 1;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int product = 1;
        int i = 1;
        int n = 1;

        while (i <= Increment) {
            System.out.println(i);
            sum += i;
            i++;
        }
        System.out.println("Sum of " + Increment + " numbers are " + sum);
        while (count < i){
            sum1 += oddnum;
            oddnum +=2;
            count++;
            sum2 += evennum;
            evennum +=2;
            count++;
        }
        System.out.println("Sum of even numbers are : " +evennum);
        System.out.println("Sum of odd numbers are : " +oddnum);
               // Loop to read and multiply n numbers
        System.out.println("Enter " + Increment + " Numbers for product: ");
          do {
            int num = scanner.nextInt();
            product *= num;
            count++;
        } while (count < Increment);

        // Output result

        System.out.println("Product of the numbers is: " +product);
        scanner.close();

    }
}
