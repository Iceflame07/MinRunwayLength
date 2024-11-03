import java.util.Scanner;
import java.time.LocalDate;
  public class MenustrualCycle {
   public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	String greetings = "Welcome!!!";
	String start = "Take This Test!";

	System.out.println("Welcome!!!");

	System.out.println("Take This Test!");
	String Test = input.next();

	System.out.print("Enter your name:");
	String name = input.next();

	System.out.print("Enter your age:");
	int age = input.nextInt();

	System.out.print("Enter the length of your menustrual cycle:");
	String Length = input.next();

	CalculateMenustrualCyclePhases(CyclePhases);
   }

public static void CalculateMenustrualCyclePhases(int CyclePhases){


	Scanner input = new Scanner(System.in);

	LocalDate today = LocalDate.now();
	System.out.println("Today's date: " + today);


	System.out.println("Enter first menustruation CyclePhases here:");
	int daysSinceMenustruation = input.nextInt();

	System.out.println("Enter the end of the first menustruation CyclePhases here:");
	int endOfMenstration = input.nextInt();

	int LocalDate = LocalDate.minusDays();

	System.out.println("Your next date is: ");


	System.out.println("Enter next menustruation CyclePhases here:");
	int nextMenustruation = input.nextInt();

	System.out.println("Enter the end of the next menustruation CyclePhases here:");
	int endOfNextMenustration = input.nextInt();

	int specificDate = LocalDate.minusDays();

	System.out.println("Your next date is: ");


	System.out.println("Enter next phase of menustruation CyclePhases here:");
	int nextPhaseMenustruation = input.nextInt();

	System.out.println("Enter the end of the next phase of menustruation CyclePhases here:");
	int endOfNextPhaseOfMenstration = input.nextInt();

	int LocalDate = LocalDate.minusDays();

	System.out.println("Your next CyclePhases is: ");


   }
}