///////////////////////////
//Ruoting Li
//Feb 13rd, 2015
//CSE002
//Banking Java Program
//
//  first compile the program
//      javac Banking.java
//  run the program
//      java Banking//

//first import
  import java.util.Scanner;
  
//define a class
  public class Banking{

//add main method
  public static void main(String[ ] args) {
  
  int originAmount = 1000 + (int) (Math.random() * 4001); //set the random start amount between 1000 to 5000
  
  System.out.println("Number 1 means depositing money."); //number 1 means deposit
  System.out.println("Number 2 means withdrawing money."); //number 2 means withdraw
  System.out.println("Number 3 means viewing account balance."); //number 3 means view account balance
  
  Scanner input = new Scanner(System.in); //new input
  System.out.print( "Enter the number from 1, 2 and 3: "); //enter the choice
  int number = input.nextInt(); // input variable --- integer number
  
//Applt switch and break
  switch (number){
	  case 1: System.out.println("depositing money.");
	          System.out.print("How much you want to deposit? ");
	          double deposit = input.nextDouble(); //input new variable --- double deposit
	          if (deposit >= 0){
	        	  System.out.println("The resulting balance is "+ (deposit+originAmount) +" $");
	          } //deposit should be a positive number
	          else{
	              System.out.println("Sorry, that is not a valid input.");
	          } //the invalid result as entering a negative number
	  break;
	  case 2: System.out.println("withdrawing money.");
	          System.out.print("How much you want to withdraw? ");
              double withdraw = input.nextDouble(); //input new variable --- double withdraw
              if (withdraw >= 0 && withdraw<=originAmount){
    	          System.out.println("The resulting balance is "+ (originAmount-withdraw) +" $");
              } //withdraw should be a positive number and cannot beyond the original amount
              else{
                  System.out.println("Sorry, that is not a valid input.");
              } //the invalid result as entering a negative number
	  break;
	  case 3: System.out.println("viewing account balance.");
	          System.out.println("The account balance is "+originAmount); //checking the account balance
	  break;
  }
      
  }   //end of main method
}  //end of class 
