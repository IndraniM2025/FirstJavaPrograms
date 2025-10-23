import java.util.Scanner;
public class ArrMultiDimentional {
    public static void main (String[] args)

    {
        int [] [] arr = new int [3][3];
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the 1st dimentional array !");

      /*  arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[1][0]=40;
        arr[1][1]=50;
        arr[1][2]=60;
        arr[2][0]=70;
        arr[2][1]=80;
        arr[2][2]=90;*/


        for (int i=0 ; i<arr.length; i++)
        {
            arr[i] = new int[]{scanner.nextInt()};
           for (int j=0;j<arr[i].length;i++)
            {
                System.out.println("Enter the 2nd dimentional array !");
                arr[j] = new int[]{scanner.nextInt()};

                System.out.print(arr[i][j] + "");
                System.out.print(arr[j]);
            }
            System.out.println("Array 2D" + arr[i] );
        }

    }
}
