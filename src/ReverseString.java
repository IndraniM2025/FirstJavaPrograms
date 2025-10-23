import java.security.Key;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Enter the String : ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();
        String Reverse = "";
        for (int i = key.length()-1; i >=0 ; i--)
        {
           Reverse  += key.charAt(i);

        }
        System.out.println("The Reverse of " + key + " is : " + Reverse.toUpperCase());
        scanner.close();
    }
}
