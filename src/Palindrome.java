import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter the String to check for Palindrome ! ");
        Scanner scanner = new Scanner(System.in);
        String IsPalindrome = scanner.next();
        String Name = "";

        for (int i = IsPalindrome.length() - 1; i >= 0; i--) {
            Name += IsPalindrome.charAt(i);
        }

        System.out.println("Reverse of the string : " + Name.toUpperCase());

        if (Name.equalsIgnoreCase(IsPalindrome)) {
            System.out.println(IsPalindrome + "is a Palindrome !");
        } else {
            System.out.println("Those words which reflects the same even after reversing are referred to as Palindrome ex: 'MADAM'");
        }

        scanner.close();
    }
}

