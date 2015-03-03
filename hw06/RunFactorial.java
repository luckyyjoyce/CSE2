///////////////////////////
//Ruoting Li
//Mar 1st, 2015
//CSE002
//RunFactorial Java Program
//
//  first compile the program
//      javac RunFactorial.java
//  run the program
//      java RunFactorial

//first import
  import java.util.Scanner;
  
//define a class
  public class RunFactorial{

//add main method
  public static void main(String[ ] args) {
  
  System.out.println("Please enter an integer that is between 9 and 16:");//prompt the user to enter an integer between 9 and 16
  int counter = 0; //initialize the variable
 
  while (counter < 1){
	  Scanner myScanner = new Scanner(System.in); //new Scanner
	  if (myScanner.hasNextInt()){
    	     int number = myScanner.nextInt();//make sure the number is an integer
    	     if (number>=9 && number<=16){
    	    	 counter++; //increment of counter, the loop ends
    	    	 System.out.println("Input accepted:");
    	    	 int sum = 1; //initialize variable sum
    	    	 int counter1 = number; //let the counter1 equals to number entered
    	    	 while(counter1 > 0){
    	    	      sum = sum * counter1; //calculate the factorial of the number
    	    	      counter1--; //decrement of counter1
    	         }
    	         System.out.println(number+"!= "+sum);	  
    	     }
    	     else{
    	    	 System.out.println("Invalid input, enter again!"); //what if the number is not between 9 and 16
    	     }
	  }
      else{
         System.out.println("Invalid input, enter again!"); //what if the number is not a integer
     }
  }
     
  }   //end of main method
}  //end of class 