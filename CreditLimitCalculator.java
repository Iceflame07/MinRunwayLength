import java.util.Scanner;

	public class CreditLimitCalculator {
	   public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int account = input.nextInt();

		System.out.print("Enter first month balance: ");
		int balance = input.nextInt();

		System.out.print("Enter this month customer item charged: ");
		int item = input.nextInt();

		System.out.print("Enter all applied: ");
		int applied = input.nextInt();

		System.out.print("Enter Creditlimit: ");
		int Creditlimit = input.nextInt();

		int newBalance = account + balance + item + applied = Creditlimit;
		System.out.print("Enter newBalance: ");

		if(newBalance > applied);
		System.out.print("Enter credit limit exceeded: ");


	}
}