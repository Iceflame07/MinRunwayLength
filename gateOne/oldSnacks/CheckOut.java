import java.util.Scanner;
  public class checkOut{
   public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the customer name:");
    String customer = input.nextLine();

    System.out.println("Enter the items bought:");
    String items = input.nextLine();

    System.out.println("How many pieces:");
    int pieces = input.nextInt();

    System.out.println("Enter the pricePerUnit:");
    int unit = input.nextInt();

    System.out.println("Add more items:");
    String Add = input.nextLine();

    String Yes = "1";
    String No = "2";

    for(int Add = 0; Add < items; Add++)

      if (Add <= 1){
	System.out.println("Yes");
    }

    else if (Add >= 2){
	System.out.println("No");
    }

    System.out.println("Enter cashier name:");
    String cashier = input.nextLine();

    int discount;

    System.out.println("How much discount will you get:");
    int discount = input.nextInt();

    System.out.println("The amount paid:");
    int amount = input.nextInt();

    int goods = pieces - pricePerUnit; 
    int balance = amount - discount;

    System.out.println(balance);

    System.out.print("THANK YOU FOR YOUR PATRONAGE!!!");
    String patronage = input.nextLine();

   }

}