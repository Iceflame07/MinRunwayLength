import java.util.Scanner;
  public class AfeezPhoneBook {
   public static void main(String[] args){


 PhoneBookMenu();

    Menu ="""
    1-> contact
    2-> Find contact by phone number
    3-> Find contact by first name
    4-> Find contact by last name
    5-> Edit contact

""";

    Scanner input = new Scanner(System.in);

    System.out.print("Enter_choice_option");
    String Menu_option = input.nextInt();

   case 1: System.out.println("Enter contact"); break;
   case 2: System.out.println("Find contact by phone number");  break;
   case 3: System.out.println("Find contact by first name"); break;
   case 4: System.out.println("Find contact by last name"); break;
   case 5: System.out.println("Edit contact"); break;
   default: System.out.print("Invalid input"); break;

  }
}
