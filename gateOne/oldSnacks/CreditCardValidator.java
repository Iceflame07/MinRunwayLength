import java.util.Scanner;
  public class CreditCardValidator {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int visaCard = 4;
	int masterCard = 5;
	int americanExpressCard = 37;
	int discoveryCard = 6;

	System.out.println("Enter your card digit:");
	String number = input.nextLine();
	System.out.println(cardFigures(number));
    }

public static String cardFigures(String number){

	if(number.startsWith("4")){
      	  return "visaCard";
   }

	if(number.startsWith("5")){
	  return "masterCard";
   }

	if(number.startsWith("37")){
	  return "americanExpressCard";
   }

	if(number.startsWith("6")){
	  return "discoveryCard";
   }
	  return "invalid cardFigures";
  }

 public static String cardValidator(String number){

	int cardLength = 16;
	int card = 0;

	for(int cardFigure = 0; cardFigure < cardLength; cardFigure++)

	   if(cardFigure <= 16){
		return "This is a valid card";
	}  else {
		return "This is an invalid card";
	}
		return "Try again";
	}

  

}