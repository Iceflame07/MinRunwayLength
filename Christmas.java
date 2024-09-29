import java.util.Scanner;

   public class Christmas {
	public static void main(String[] args) {


	String listOfChristmasMenu ="""
	1->A partridge in a pear tree
	2->Two turtle doves
	3->Three french hens
	4->Four calling birds
	5->Five golden rings
	6->Six geese a-laying
	7->Seven swans a-swimming
	8->Eight maids a-milking
	9->Nine ladies dancing
	10->Ten lords a-leaping
	11->Eleven pipers piping
	12->Twelve drummers drumming
""";

	Scanner input = new Scanner(System.in);
	System.out.print("Enter choice: ");
	int ChristmasMenu = input.nextInt();

	switch(ChristmasMenu) {

	case 1: System.out.println("On the first day of christmas my true love gave to me,\n a partridge in a pear tree"); break;

	case 2: System.out.println("On the second day of christmas my true love gave to me,\n two turtle doves and a partridge in a pear tree"); break;

	case 3: System.out.println("On the third day of christmas my true love gave to me,\n three french hens,two turtle dove and a partrige in a pear tree"); break;

	case 4: System.out.println("On the fourth day of christmas my true love gave to me,\n four calling birds,three french hens,two turtle dove and a partridge in a pear tree"); break;

	case 5: System.out.println("On the fifth day of christmas my true love gave to me,\n five golden rings,four calling birds,three french hens,two turtle dove and a partridge in a pear tree"); break;

	case 6: System.out.println("On the sixth day christmas my true love gave to me,\n six geese a-laying,five golden rings,four calling birds,three french hens,two turtle dove and a partridge in a pear tree"); break;

	case 7: System.out.println("On the seventh day of christmas my true love gave to me,\n seven swans a-swimming,six geese a-laying,five golden rings,four calling birds,three french hens,two turtle dove,and a partridge in a pear tree"); break;

	case 8: System.out.println("On the eight day of christmas my true love gave to me,\n eight maids a-milking,seven swans a-swimming,six geese a-laying,five golden rings,four calling birds,three french hens,two turtle dove,and a partridge in a pear tree"); break;

	case 9: System.out.println("On the nineth day of christmas my true love gave to me,\n nine ladies dancing,eight maids are milking,seven swams are swimming,six geese are laying,five golden rings,four calling birds,three french hens,two turtle dove and a partridge in a pear tree"); break;

	case 10: System.out.println("On the tenth day of christmas my true love gave to me,\n ten lords a-leaping,nine ladies dancing,eight maids a-milking,seven swams a-swimming,six geese a-laying,five golden rings,four calling birds,three french hens,two turtle dove and a partridge in a pear tree"); break;

	case 11: System.out.println("On the eleventh day of christmas my true love gave to me,\n eleven pipers piping,ten lords a-leaping,nine ladies dancing,eight maids a-milking,seven swams a-swimming,six geese are laying,five golden rings,four calling birds,three french hens,two turtle dove and a partridge in a pear tree"); break;

	case 12: System.out.println("On the twelveth day of christmas my true love gave to me,\n twelve drummers drumming,eleven pipers piping,ten lords a-leaping,nine ladies dancing,eight maids a-milking,seven swams a-swimming,six geese a-laying,five golden rings,four calling birds,three french hens,two turtle dove and a partridge in a pear tree"); break;

	case 0: System.out.println("Enter choice: "); break;

	default :System.out.println("Back to christmas"); break;
      }









   }

}