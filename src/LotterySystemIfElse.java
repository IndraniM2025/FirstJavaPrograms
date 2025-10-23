import java.util.Scanner;

public class LotterySystemIfElse {

    public static void main(String[] args) {
        System.out.println("Welcome to lottery system ABC !. You have 3 chances to attempt for the luck number .");
        System.out.println("Please enter your 1st Number :");
        Scanner scanner = new Scanner(System.in);
        int pickedNum = scanner.nextInt();
        int luckyNum = 55;

        /*for (int i=0;i<3; i++)*/
        {
            if (pickedNum != luckyNum)
            {
                System.out.println("Please enter your 2nd Number :");
                Scanner S2 = new Scanner(System.in);
                int Num2 = scanner.nextInt();
                if (Num2 != luckyNum)
                {
                    System.out.println("Please enter your 3rd Number :");
                    Scanner S3 = new Scanner(System.in);
                    int Num3 = scanner.nextInt();
                    if (Num3 != luckyNum)
                    {
                        System.out.println("Try Again !");
                    }
                    else
                    {
                        System.out.println("Congratulation ! You Won .. ");
                    }


                }
                else
                {
                    System.out.println ("Congratulation ! You Won .. ");
                }
            }
            else
            {
                System.out.println ("Congratulation ! You Won .. ");
            }
        }
    }
}
