import java.util.Scanner;
  public class MenustrualCycle {
   public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	String greetings = "Welcome!!!";
	String start = "Take This Test!";

	System.out.println("Welcome!!!");

	System.out.println("Take This Test!");
	String Test = input.nextLine();

	System.out.print("Enter your name:");
	String name = input.nextLine();

	System.out.println("Enter your age:");
	int age = input.nextInt();

	System.out.println("Enter your sex:");
	String sex = input.next();

	System.out.println("Did you know??, That the fertility is diagnosed in about 1 to 6 couples");
	String fertility = input.nextLine();

	System.out.print("Enter the length of your menustrual cycle:");
	String cycle = input.nextLine();

      }

public void getlocalDate(String[] date,converter){

	Date date = new Date();
	string localDate = ("yyyy.mm.dd");

	int month = 0;
	int year = 0;

	System.out.println("Enter first menustruation date here:");
	int date = localDate.parse(date,month,year);

	System.out.println("Enter the end of the first menustruation date here:");
	int first = localDate.parse(date,month,year);

	for(int i = 0; i < localDate; i++);

	   if(days == 7){
		System.out.println("You just hit your Menses phase");
	 } else if(days == 15) {
		System.out.println("You just hit your Follicular phase");
	 } else if(days == 21) {
		System.out.println("You just hit your Ovulation phase");
	 } else if(days == 28) {
		System.out.println("You just hit your Luteal phase");
	 } else if(age == 50) {
		System.out.println("You have reached your memopause stage");
	 } else if(age == 8) {
		System.out.println("You are under age");
	 } else {
		System.out.print("Consult your doctor!!!");
	 }
    
   
   }
}