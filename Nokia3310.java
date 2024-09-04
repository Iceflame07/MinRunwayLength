import java.util.Scanner;

	public class Nokia3310 {
	public static void main (String[] args) {

	mainMenu();
}

	String List Of mainMenu ="""
	1->Phonebook
	2->Messages
	3->Chat
	4->Call register
	5->Tones
	6->Settings
	7->Call divert
	8->Games
	9->Calculator
	10->Reminders
	11->Clock
	12->Profiles
	13->SIM services
	""";

	System.out.println(mainMenuOption);

	Scanner input = new Scanner(System.in);
	System.out.print("Enter choice");
	int listofmainMenu = input.nextInt();

	switch(MainMenu) {

	case "1": System.out.println("phonebook..."); break;
	case "2": System.out.println("messages..."); break;
	case "3": System.out.println("chat..."); break;
	case "4": System.out.println("call register..."); break;
	case "5": System.out.println("tones..."); break;
	case "6": System.out.println("settings..."); break;
	case "7": System.out.println("call divert..."); break;
	case "8": System.out.println("games..."); break;
	case "9": System.out.println("calculator..."); break;
	case "10": System.out.println("reminders..."); break;
	case "11": System.out.println("clock..."); break;
	case "12": System.out.println("profiles..."); break;
	case "13": System.out.println("SIM services..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to phonebook"); break;

}	
	public static void main() {

	String phonebookOptions =""" 

	List of phonebook Menu
	1->Phonebook
	  1->Phone		
	  2->Service Nos.
	  3->Add Name
	  4->Clear
	  5->Edit
	  6->Assign Tone
	  7->Send b'card
	  8->Option	
	  9->Speed dials
	  10->Voice tags
	  """;
}
	System.out.print(phonebookOptions);

	Scanner input = new Scanner(System.in);
	System.out.println("Enter choice");
	int listOfPhonebookMenu = input.nextInt();

	switch(phonebook) {

	case "1": System.out.println("phone..."); break;
	case "2": System.out.println("service Nos..."); break;
	case "3": System.out.println("add name..."); break;
	case "4": System.out.println("clear..."); break;
	case "5": System.out.println("edit..."); break;
	case "6": System.out.println("assign tone..."); break;
	case "7": System.out.println("send b'card..."); break;
	case "8": System.out.println("options..."); break;
	case "9": System.out.println("Speed dials..."); break;
	case "10": System.out.println("Voice tags..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to messages"); break;
}

	public static void main() {

	String Options ="""

	   List of Options menu 
	   1->Type of view
	   2->Memory status
	   """;
}

	System.out.print(Options)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listofmainMenu = input.nextInt();

	switch(Options)

	case "1": System.out.println("type of view..."); break;
	case "2": System.out.println("memory status..."); break;
	case "0": System.out.println("Enter choice"); break;
	default: System.out.println("Back to options"); break;
}

  	public static void main() {

	String messagesOptions ="""
 
	List of messages menu
	2->Messages
	  1->Write messages		
	  2->Inbox
	  3->Outbox
	  4->Picture messages
	  5->Templates
	  6->Smileys
	  7->Message settings
	  8->Info service
	  9->Voice mailbox number
	  10->Service command editor
	  """;
}

	System.out.print(messagesOptions);

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfMessagesMenu = input.nextInt();

	switch(messages) {

	case "1": System.out.println("write messages..."); break;
	case "2": System.out.println("inbox..."); break;
	case "3": System.out.println("outbox..."); break;
	case "4": System.out.println("picture messages..."); break;
	case "5": System.out.println("templates..."); break;
	case "6": System.out.println("smileys..."); break;
	case "7": System.out.println("message settings..."); break;
	case "8": System.out.println("info service..."); break;
	case "9": System.out.println("voice mailbox number..."); break;
	case "10": System.out.println("service command editor..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to messages"); break;
}

	public static void main() {

	String setOptions =""" 
	  List of set1Menu 
	  1.Message center number
	  2.Message sent as
	  3.Message validity
	  """;


	System.out.print(setOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfSet1Menu = input.nextInt();

	switch(set) (

	case "1": System.out.println("message center number..."); break;
	case "2": System.out.println("message sent as..."); break;
	case "3": System.out.println("message validity..."); break;
	case "0": System.out.println("Enter choice"); break;
	default: System.out.println("Back to set"); break;

}
	public static void main() {

	String commonOptions ="""
 
        List of CommonMenu
	1.Delivery reports
	2.Reply via same centre
	3.Character support
	""";

	System.out.print(commonOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfCommonMenu = input.nextInt();

	switch(common) {

	case "1": System.out.println("delivery report..."); break;
	case "2": System.out.println("reply via same centre..."); break;
	case "3": System.out.println("character support..."); break;
	case "0": System.out.println("Enter choice"); break;
	default: System.out.println("Back to common"); break;
}

	public static void main() {

	String chatOptions =""" 
	List of ChatMenu 
	3-> Chat
	 """;

	 System.out.print(chatOptions)

	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter choice");
	 int listOfChatMenu = input.nextInt();

	 switch(chat) {

	 case "1": System.out.println("chat..."); break;
	 case "0": System.out.println("Enter choice"); break;
	 default: System.out.println("Back to chat"); break;

}

	 //collect a user input int choice = scanner.nextInt():

	 public static void main() {

	 String callRegisterOptions ="""

	 List of CallRegister Menu
	4->Call register
	 1.Missed calls		
	 2.Received calls
	 3.Dialled numbers
	 4.Erase recent call list
	 5.Show call duration
	 """;

	System.out.print(callRegisterOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfCallRegisterMenu = input.nextInt();

	switch (call register) {

	case "1": System.out.println("missed calls..."); break
	case "2": System.out.println("received calls..."); break;
	case "3": System.out.println("dialled calls..."); break;
	case "4": System.out.println("erase recent call list..."); break;
	case "5": System.out.println("show call duration"); break;
	case "0": System.out.println("Enter choice"); break;
	default: System.out.println("Back to call register"); break;

}

	//collect a user input int choice = scanner.nextInt():

	public static void main() {

	String ShowCallDurations Options ="""
	List of ShowCallDurationMenu
	  1.Last call duration
	  2.All calls duration
	  3.Received calls duration
	  4.Dialled calls duration
	  5.Clear timer
	  """;
}

	System.out.print(ShowCallDurationOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfShowCallDurationMenu = input.nextInt();

	switch(ShowCallDuration) {

	case "1": System.out.println("last call duration..."); break;
	case "2": System.out.println("all calls duration..."); break;
	case "3": System.out.println("received calls duration..."); break;
	case "4": System.out.println("dialled call duration..."); break;
	case "5": System.out.println("clear timer"); break;
	case "0": System.out.println("Enter choice"); break;
	default: System.out.println("Back to show call duration"); break;

}

	//collect a user input int choice = scanner.nextInt():

	public static void main() {

	String ShowCallCostsOptions ="""

	List of Show call cost Menu
	  1->Last call cost
	  2->All calls cost
	  3->Clear counters
	  """;

	  System.out.print(ShowCallCostOptions)

	  Scanner input = new Scanner(System.in);
	  System.out.println ("Enter choice");
	  int listOfShowCallCostMenu = input.nextInt();

	  switch(showcallcost) {

	  case "1": System.out.println("last call cost..."); break;
	  case "2": System.out.println("all calls cost..."); break;
	  case "3": System.out.println("clear counter..."); break;
	  case "0": System.out.println("Enter choice"); break;
	  default: System.out.println("Back to show call cost"); break;
}

	  //collect a user input int choice = scanner.nextInt():

	  public static void main() {

	  String callCostsOptions = """

	  List of Call cost settings
	  1->Call cost limit
	  2->Show costs in
	  """
	  System.out.print(CallCostSettingsOptions)

	  Scanner input = new Scanner(System.in);
	  System.out.println ("Enter choice");
	  int listOfCallCostSettingsMenu = input.nextInt();

	  switch (CallCostSettings) {

	  case "1": System.out.println("call cost limits..."); break;
	  case "2": System.out.println("show cost in..."); break;
	  case "0": System.out.println("Enter choice"); break;
	  default: System.out.println("Back to call cost settings"); break;

}
  	
	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String tonesOptions =""" 
	""";

	List of tones menu:

	5->Tones 
	  1->Ringing tone	
	  2->Ringing volume
	  3->Incoming call alert
	  4->Composer
	  5->Message alert tone
	  6->Keypad tones
	  7->Warning and games tones
	  8->Vibrating alert
	  9->Screen saver
	  """;
}

	System.out.println(tonesOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfTonesMenu = input.nextInt();

	switch(tones) {

	case "1": System.out.println("ringing tone..."); break;
	case "2": System.out.println("ringing volume..."); break;
	case "3": System.out.println("incoming call alert..."); break;
	case "4": System.out.println("composer..."); break;
	case "5": System.out.println("message alert tone..."); break;
	case "6": System.out.println("keypad tones..."); break;
	case "7": System.out.println("warning and games tone..."); break;
	case "8": System.out.println("vibrating alert..."); break;
	case "9": System.out.println("screen saver..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to tones"); break;
}

	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String settings Options =""" 

	List of settings menu

	6->Settings
	  List of Call settings
	  1->Automatic redial	 
	  2->Speed dialling
	  3->Call waiting options
	  4->Own number sending
	  5->Phone line in use
	  6->Automatic answer
	  """;
}

	System.out.print(settingsOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfSettingsMenu = input.nextInt();

	switch(settings) {

	case "1": System.out.println("automatic redial..."); break;
	case "2": System.out.println("speed dialling..."); break;
	case "3": System.out.println("call waiting options..."); break;
	case "4": System.out.println("own number sending..."); break;
	case "5": System.out.println("phone line in use..."); break;
	case "6": System.out.println("automatic answer..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to settings"); break;

}

	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String phoneSettingsOptions = """ 

	List of phoneSettingsMenu
	  1->Language		
	  2->Cell info display
	  3->Welcome note
	  4->Network selection
	  5->Lights
	  6->Automatic answer
	  """;
}

	System.out.print(phoneSettingsOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfPhoneSettingsMenu = input.nextInt();

	switch(phonesettings) {

	case "1": System.out.println("language..."); break;
	case "2": System.out.println("cell info display..."); break;
	case "3": System.out.println("welcome note..."); break;
	case "4": System.out.println("network selection..."); break;
	case "5": System.out.println("lights..."); break;
	case "6": System.out.println("automatic answer..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to phonesettings"); break;

}
	//collect a user input int choice = scanner.nextInt():

	public static void main() {

	String securitySettingsOptions =""" 

	List of securitySettingsMenu
	  1->Pin code request		
	  2->Call barring service
	  3->Fixed dialling
	  4->Closed user group
	  5->Phone security
	  6->Change access codes
	  """;
}

	System.out.print(securitySettingsOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfSecuritySettingsMenu = input.nextInt();

	switch(securitysettings) {

	case "1": System.out.println("pin code request..."); break;
	case "2": System.out.println("call barring service..."); break;
	case "3": System.out.println("fixed dialling..."); break;
	case "4": System.out.println("closed user group..."); break;
	case "5": System.out.println("phone security..."); break;
	case "6": System.out.println("change access code..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to securitysettings"); break;

}
	//collect a user input int choice = scanner.nextInt():

	public static void main() {

	String restoreFactory Settings Options = """ 

	List of RestoreFactorySettingsMenu
	  1->Restore factory settings
	  """;

	System.out.print(restoreFactorySettingsOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfRestoreFactrySettingsMenu = input.nextInt();

	switch(restorFactorysettings) {

	case "1": System.out.println("restore factory settings..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to restorefactorysettings"); break;
}

	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String call divert Options = """ 

	List of callDivertMenu
	7->Call divert
	""";

	System.out.print(callDivertOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfCalldivertMenu = input.nextInt();

	switch(callDivert) {

	case "1": System.out.println("call divert..."); break;
	case "2": System.out.println("Enter choice"); break;
	case "3": System.out.println("Invalid choice"); break;
	default :System.out.println("Back to call divert"); break;
}


	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String gamesOptions =""" 

	List of GamesMenu
	8->Games
	""";

	System.out.print(gamesOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfGamesMenu = input.nextInt();

	switch(games) {

	case "1": System.out.println("games..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to games"); break;
}

	
	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String calculatorOptions = """ 

	List of CalculatorMenu
	9->Calculator
	""";

	System.out.print(calculatorOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfCalculatorMenu = input.nextInt();

	switch(calculator) {

	case "1": System.out.println("calculator..."); break;
	case "2": System.out.println("Enter choice"); break;
	case "3": System.out.println("Enter invalid option"); break;
	default :System.out.println("Back to calculator"); break;
}


	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String ReminderOptions = """ 

	List of ReminderMenu
	10->Reminder
	""";

	System.out.print(reminderOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfReminderMenu = input.nextInt();

	switch(reminder) {

	case "1": System.out.println("reminder..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to reminder"); break;
}

	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String ClockOptions = """ 
	
	List of ClockMenu
        11->Clock
	  1->Alarm clock
	  2->Clock settings
	  3->Date settings
	  4->Stopwatch
	  5->Countdown timer
	  6->Auto update of date and time
	  """;

	System.out.print(clockOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfClockMenu = input.nextInt();

	switch(clock) {

	case "1": System.out.println("alarm clock..."); break;
	case "2": System.out.println("clock settings..."); break;
	case "3": System.out.println("date settings..."); break;
	case "4": System.out.println("stopwatch..."); break;
	case "5": System.out.println("countdown timer..."); break;
	case "6": System.out.println("auto update of date and time..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to clock"); break;
}

	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String profilesOptions = """ 

	List of ProfilesMenu

	12->Profiles
	""";

	System.out.print(profilesOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfProfilesMenu = input.nextInt();

	switch(profiles) {

	case "1": System.out.println("profiles..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to profiles"); break;
}

	
	//collect a user input int choice = scanner.nextInt():

  	public static void main() {

	String SIM services Options = """ 

	List of SIMservicesMenu

	13->SIM services
	""";

	System.out.print(SIMservicesOptions)

	Scanner input = new Scanner(System.in);
	System.out.println ("Enter choice");
	int listOfSIMserviceMenu = input.nextInt();

	switch(SIM services) {

	case "1": System.out.println("SIM services..."); break;
	case "0": System.out.println("Enter choice"); break;
	default :System.out.println("Back to SIM services"); break;
}



}
