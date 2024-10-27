import java.util.Scanner;
  public class CreditCardValidator {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your card sixteen digit:");
	int number = input.nextInt();

	int firstNumber = (38);
	int secondNumber = (37);
	int cardLength = (16);
	int count = (0);
	int visaCard = (4);
	int masterCard = (5);
	int americanExpressCard = (37);
	int discoverCard = (6);

	for(int card = 0; card < cardLength; card++);

      if(visaCard == 16){
	     System.out.println("card is visaCard");

      } else if(masterCard == 16){
	     System.out.println("card is masterCard");

      } else if(americanExpressCard == 16){
	     System.out.println("card is americanExpressCard");

      } else if(discoverCard == 16){
	     System.out.println("card is discoverCard");

      } else if(cardLength != 16){
	     System.out.println("Invalid card,try again!!!");

      } else {
	     System.out.println("Invalid card,try again!!!");
      }


  }

}




