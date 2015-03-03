///////////////////////////
//Ruoting Li
//Mar 1st, 2015
//CSE002
//GetIntegers Java Program
//
//  first compile the program
//      javac GetIntegers.java
//  run the program
//      java GetIntegers

//first import
  import java.util.Scanner;
  
//define a class
  public class GetIntegers{

//add main method
  public static void main(String[ ] args) {

  int sum = 0; //initialize the variable sum
  System.out.println("Please enter 5 non-negative integers:"); //prompt the user to enter 5 integers
  
  for(int count = 0; count < 5;){
	  Scanner myScanner = new Scanner(System.in); //enter an integer
	  if (myScanner.hasNextInt()){
	      int number = myScanner.nextInt(); //make sure the number is a integer    
	      if (number >=0){
	    	  count++; //increment of the count
	    	  sum = sum + number; //calculate the sum in a loop
	      }
	      else{
	          System.out.println("Invalid input, enter again"); //what if the integer is less than 0
	      }
      }
      else{
          System.out.println("Invalid input, enter again"); //what if the the number is not an integer
      }
  }
      
      
  System.out.println("Sum is "+sum); //print out the sum of five non-negative integers 
      
      
  }   //end of main method
}  //end of class 