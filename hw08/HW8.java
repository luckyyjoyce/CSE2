///////////////////////////
//Ruoting Li
//Mar 21st, 2015
//CSE002
//HW8 Java Program
//
//  first compile the program
//      javac HW8.java
//  run the program
//      java HW8

//first import
  import java.util.Scanner;

//define a class
  public class HW8{

//add a main method
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in); //new Scanner
  System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
  System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
  String input = getInput(scan, "Cc"); //apply the fist method
  System.out.println("You are in a dead valley");
  System.out.println("Please hit 'C' or 'c' to continue,anything else to quit-");
  input = getInput(scan, "Cc"); //apply the first method
  System.out.println("You walked and walked and walked you saw a cave!");
  cave(); //apply a method called cave
  System.out.println("Please hit 'C' or 'c' to continue,anything else to quit-");
  input = getInput(scan, "Cc"); //apply the first method
  System.out.println("You entered a cave!");
  System.out.println("Please hit 'C' or 'c' to continue,anything else to quit-");
  input = getInput(scan, "Cc"); //apply the first method
  System.out.println("Unfortunately, you ran into a GIANT!");
  giant(); //apply a method called giant
  System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is yo YIELD");
  input = getInput(scan, "AaEe",10); //apply the method to prompt user to enter A,a,E or e
  System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
  System.out.println("There are three treasure box in front of you! Enter the box number you want to open!");
  box(); //apply a method called box
  input = getInput(scan); //apply a method to let user choose the treasure box
  System.out.println("Hero! Have a good day!");
  }//end of method
  
//add a method to enter c or C
  public static String getInput(Scanner scan,String string){
	  String a1 = scan.nextLine(); //first enter a string
	  char c1 = string.charAt(0); //to get "C" from string
	  char c2 = string.charAt(1); //to get "c" from string
	  String c3=""+c1; //to cast char to string
	  String c4=""+c2; //to cast char to string
	  //the situation when user enter "c" or "C"
	  if(a1.equals (c3)||a1.equals(c4)){
		  String x="";
		  return x; //when enter "c" or "C", return nothing
	  }
	  else {
		  System.out.println("Yea right LOSER!");
		  System.exit(0);//exit the program when not enter "c" or "C"
		  String x = "Yea right LOSER!";
		  return x; //return string Yea tight LOSER
	  }
  }//end of method
  
//add a method called cave
  public static void cave() {
      System.out.println("                              *****   * * * * * * * *        ");
      System.out.println("                         ***         ***                      ");
      System.out.println("                      ***               ***                   ");
      System.out.println("                 |    ***               ***                   ");
      System.out.println("                 |    ***               ***                   ");
      System.out.println("             O __|__  ***               ***                   ");
      System.out.println("           ******l    ***               ***                   ");
      System.out.println("            * *       ***               ***                   ");
      System.out.println("           *   *      ********************* * * * * * *       ");
  }//end of method

//add a method called giant
  public static void giant() {
      System.out.println("                                 ---------                    ");
      System.out.println("                                |  /    \\|                   ");
      System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
      System.out.println("                           H     -----------   H              ");
      System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
      System.out.println("                           H    HHHHHHHHHHH    H                      ");
      System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
      System.out.println("                                HHHHHHHHHHH                   ");
      System.out.println("                                HHH     HHH                   ");
      System.out.println("                               HHH       HHH                   ");
  }//end of method
  
//add a method to prompt user to enter A or a or E or e
  public static String getInput(Scanner scan,String string,int trial){
	  String a1 = scan.nextLine();//prompt the user to enter a key
	  char c1 = string.charAt(0); //to get "A" from string
	  char c2 = string.charAt(1); //to get "a" from string
	  char c3 = string.charAt(2); //to get "E" from string
	  char c4 = string.charAt(3); //to get "e" from string
	  String cc1 = ""+c1; //cast char to string
	  String cc2 = ""+c2; //cast char to string
	  String cc3 = ""+c3; //cast char to string
	  String cc4 = ""+c4; //cast char to string
	  String cc5 = ""; //new string with nothing
	  int count = 0; //let a count originally be 0
	  boolean check = true; //boolean check is true originally
	  //start the loop when count less than 10 or check is false
	  while(count<trial||!check){
		  //the situation when user enter "A" or "a"
		  if(a1.equals(cc1)||a1.equals(cc2)){
			  int a = (int)(Math.random()*2);//random get a number from 0 to 1
			  //what if a is 0
			  if(a==0){
			  count++; //increment of count
		      System.out.println("Critical hit!");
		         //when count increase to 10
		         if(count == 10){
				    break; //break the loop
			     }
		         //other situation
		         else{
		            //to prompt the user to enter again
		        	System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is yo YIELD");
			        a1 = scan.nextLine();
		         }
		      }
		      //what if a is 1
			  else if(a==1){
		      System.out.println("Gosh! How can you miss it!");   
		      //to prompt the user to enter again
		      System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is yo YIELD");
			  a1 = scan.nextLine();
		     }
	      }
	      //the situation when the user enter "E" or "e"
		  else if (a1.equals(cc3)||a1.equals(cc4)){
	    	  int b = 1+(int)(Math.random()*10);//random get a number from 1 to 10
	    	  //what if the number equals to 10
	    	  if(b==10){
			  System.out.println("Escaped successfully");
			  System.exit(0); //exit the program
		      }
		      //what if the number is not 10
	    	  else{
		          check = false; //boolean check equals to false
		          //to prompt the user to enter again
		          System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is yo YIELD");
				  a1 = scan.nextLine();
		      }
	      }
	      //the situation when the user don't enter "A","a","E" or "e" 
		  else{
	      System.out.println("Excuted by the GIANT!Game Over!");
		  System.exit(0);//exit the program
	      }
  }
	  return cc5; //return an empty string
  }//end of method

 //add a method called box
  public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
       System.out.println("                     ***               ***     ***               ***    ***               ***              ");
       System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
       System.out.println("                     ***               ***     ***               ***    ***               ***              ");
       System.out.println("                     *********************     *********************    *********************               "); 
   }//end of method

//add a method to choose box
  public static String getInput(Scanner scan){
	  String empty = ""; //new string called empty with nothing
	  int enter = scan.nextInt(); //to prompt the user to enter an integer
	  switch(enter){
	  //the case when enter equals to 1
	  case 1: System.out.print("Free meals for a month. ");break; 
	  //the case when enter equals to 2
	  case 2: System.out.print("It is GPA4.00. ");break;
	  //the case when enter equals to 3
	  case 3: System.out.print("It is 100 dollars Amazon gift card. ");break;
	  //default case
	  default: System.out.println("A WRONG NUMBER! You get nothing! Better restart the game LOL");
	           System.exit(0); //exit the program
	  }
      return empty; //return an empty string
  }
    
}//end of class
  