
import java.util.Scanner;
		
  public class BMI{
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter weight in Kilo:");
      double weight = input.nextDouble();

      System.out.print("Enter height in inches:");
      double height = input.nextDouble();

      System.out.print("weigth in pound" + "height in inches");
      double total = weight / (height * height);

      System.out.println("BMI is " + total);
     }
  };

