import java.util.Scanner;

public class LotterySystemWhile
{
    public static void main (String[] args)
    {
        System.out.println("***********************************************************************");
        System.out.println("Welcome to the Lottery System !");
        System.out.println("***********************************************************************");
        System.out.println("Pick your 1st number : ");
        Scanner S1 = new Scanner(System.in);
        int choice1 = S1.nextInt();
        int luckyNum = 55;

        while (choice1 == luckyNum)
        {
            System.out.println("Won !");
            break;
        }
        while  (choice1 != luckyNum)
        {
            System.out.println("Pick your 2nd number : ");
            Scanner S2 = new Scanner(System.in);

            /*if ()*/
        }


    }
}
