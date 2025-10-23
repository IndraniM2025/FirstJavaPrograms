import java.util.Scanner;
public class SwitchDemo {
    public static  void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice :");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Welcome !");
                break;
            case 2:
                System.out.println("Goodbye !");
                break;
            case 3:
                System.out.println("How are you !");
                break;
            case 4:
                System.out.println("Get Well soon !");
                break;
            default:
                System.out.println("Try Again !");

        }

    }
}
