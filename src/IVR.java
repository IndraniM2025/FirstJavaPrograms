import java.util.Scanner;
public class IVR {
             public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
              System.out.println("Call Menu");
                 System.out.println("Press 1 for English");
                 System.out.println("Press 2 for French");
                 System.out.println("Enter the choice: ");

                 int Choice = scanner.nextInt();
                 if (Choice == 1) {
                     // English menu
                     System.out.println("1. Sales");
                     System.out.println("2. Tech Support");
                     System.out.println("3. Feedback");
                     System.out.println("Enter the choice: ");

                     int DoChoice = scanner.nextInt();

                     switch (DoChoice) {
                         case 1: // Sales
                             System.out.println("1. Offers");
                             System.out.println("2. Discount");
                             System.out.println("Enter the choice: ");
                             int Choice1 = scanner.nextInt();

                             if (Choice1 == 1) {
                                 System.out.println("1. Mobile");
                                 System.out.println("2. iPhone 17");
                                 System.out.println("Enter the choice: ");
                                 int offerChoice = scanner.nextInt();
                                 if (offerChoice == 1) {
                                     System.out.println("You selected: Mobile Offers");
                                 } else if (offerChoice == 2) {
                                     System.out.println("You selected: iPhone 17 Offers");
                                 } else {
                                     System.out.println("Invalid selection.");
                                 }
                             } else if (Choice1 == 2) {
                                 System.out.println("You selected: Discount");
                             } else {
                                 System.out.println("Invalid selection.");
                             }
                             break;

                         case 2: // Tech Support
                             System.out.println("1. Internet Issues");
                             System.out.println("2. Network Issues");
                             System.out.println("3. Billing");
                             System.out.println("Enter the choice: ");
                             int Choice2 = scanner.nextInt();

                             if (Choice2 == 1) {
                                 System.out.println("You selected: Internet Issues");
                             } else if (Choice2 == 2) {
                                 System.out.println("You selected: Network Issues");
                             } else if (Choice2 == 3) {
                                 System.out.println("1. Payment Plan");
                                 System.out.println("2. Bill Payment");
                                 System.out.println("Enter the choice: ");
                                 int billChoice = scanner.nextInt();

                                 if (billChoice == 1) {
                                     System.out.println("You selected: Payment Plan");
                                 } else if (billChoice == 2) {
                                     System.out.println("You selected: Bill Payment");
                                 } else {
                                     System.out.println("Invalid selection.");
                                 }
                             } else {
                                 System.out.println("Invalid selection.");
                             }
                             break;

                         case 3: // Feedback
                             System.out.println("1. Kudos");
                             System.out.println("2. Complaints");
                             System.out.println("Enter the choice: ");
                             int feedbackChoice = scanner.nextInt();

                             if (feedbackChoice == 1) {
                                 System.out.println("You selected: Kudos");
                             } else if (feedbackChoice == 2) {
                                 System.out.println("You selected: Complaints");
                             } else {
                                 System.out.println("Invalid selection.");
                             }
                             break;
                         default:
                             System.out.println("Invalid selection.");
                             break;
                     }

                 } else if (Choice == 2) {
                     System.out.println("French menu coming soon...");
                                    } else {
                     System.out.println("Invalid language selection.");
                 }

                 scanner.close();
             }
}

