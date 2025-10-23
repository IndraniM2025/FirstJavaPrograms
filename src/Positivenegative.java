import java.util.Scanner;

public class Positivenegative {
    public static void main(String[] args) {
      /* int xx = -10;
        if (xx >= 0)
        {
            System.out.println(" xx is Positive ! ");
        }
        else
        {
            System.out.println(" xx is Negative ! ");
        } */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int x = input.nextInt();
        System.out.println("Enter the number2 : ");
        int y = input.nextInt();
        System.out.println("Enter the number3 : ");
        int z = input.nextInt();

        int largest;
        if (x > y && x > z) {
            largest = x;
        } else if (y > x && y > z) {
            largest = y;
        } else {
            largest = z;
        }

       largest = Math.max(x, Math.max(y, z));
       System.out.println("The largest number is :" + largest);

    }

}

/*if (x % 2 == 0)
{
    System.out.println(x + " is even");
}
else
{
    System.out.println(x + " is odd");
}
}

}*/
