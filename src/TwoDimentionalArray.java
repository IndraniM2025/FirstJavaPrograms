import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int [][] arr1 = new int[3][3];
        int [][] arr2 = new int[3][3];
        int [][] arr3 = new int[3][3];

        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++)
            {
                System.out.println("Enter value for array 1 : " + i + " " + j);
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j <arr2.length; j++) {
            for (int k = 0; k <arr2.length; k++)
            {
                System.out.println("Enter value for array 2 : " +j + " " +k);
                arr2[j][k] = scanner.nextInt();
            }
        }
        for (int k = 0; k <arr3.length; k++)
        {
            for (int l =0 ; l <arr3.length ; l++)
            {
                System.out.println("Enter value for array 3 :" +k + " " +l);
                arr3[k][l] = scanner.nextInt();
            }
        }
        for (int l = 0; l < arr3.length ; l++) {
                System.out.println("The array looks like :" + Arrays.toString(arr1[l]));
            }

        }

    }

