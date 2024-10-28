import java.util.Scanner;
  public class CheckOut {
   public static void main(String[] args) {

    System.out.print("Enter the customer name:");
    string customer = input.nextLine();

    System.out.print("Enter the product name:");
    string product = input.nextLine();

    System.out.print("Enter the price per unit:");
    string product = input.nextLine();

    System.out.print("Add more items:");
    string items = input.nextLine();

    System.out.print("Enter the amount of product purchased:");
    string amount = input.nextLine();

    System.out.print("Enter seller name:");
    string seller = input.nextLine();

    ItemsPriceMenu();

    ItemsPricePerUnitMenu ="""
    0->Choice
    1->Rice price $50
    2->Oil price $20
    3->Spaghetti price $100
    4->Bread price $50
    5->Beans price $20
    6->Yam price $30
    7->Coconut price $10

""";


    System.out.println(itemsMenuOption);

    Scanner input = new Scanner(System.in);

    switch(itemsMenuOption) {

    case 0: System.out.println("Enter choice:"); break;
    case 1: System.out.println("Enter the amount of rice:"); break;
    case 2: System.out.println("Enter the amount of oil:"); break;
    case 3: System.out.println("Enter the amount of spaghetti:"); break;
    case 4: System.out.println("Enter the amount of bread:"); break;
    case 5: System.out.println("Enter the amount of beans:"); break;
    case 6: System.out.println("Enter the amount of yam:"); break;
    case 7: System.out.println("Enter the amount of coconut:"); break;
    default: System.out.println("Invalid choice"); break;

   }

    int count = 0;
    int items = 7;

    for(int products = 0; products < items; products++);

       if(items == 1){
	  System.out.println("You bought one item");

     } else if(items == 2){
	  System.out.println("You bought two items");

     } else if(items == 3){
	  System.out.println("You bought three items");

     } else if(items == 4){
	  System.out.println("You bought four items");

     } else if(items == 5){
	  System.out.print("You bought five items");

     } else if(items == 6){
	  System.out.println("You bought six items");

     } else if(items == 7){
	  System.out.println("You bought seven items");
     } else {
	  System.out.print("Add more items");
     }


   }

}