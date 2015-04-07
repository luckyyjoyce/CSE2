///////////////////////////
//Ruoting Li
//Apr. 4th, 2015
//CSE002
//ArrayInputs Java Program
//
//  first compile the program
//      javac ArrayInputs.java
//  run the program
//      java ArrayInputs

//first import
  import java.util.Scanner;

//define a class  
  public class ArrayInputs {
  
//add a main method
  public static void main(String[ ] args){
  Scanner input = new Scanner (System.in);//new scanner
  
  System.out.print("Please enter an integer for the size of the array:"); 
  int number = input.nextInt(); //prompt the user to enter the size of the array
  
  int[] array = new int[number]; // declare the array
  int i = 0;
  while (i<number){
	    System.out.print("Please enter a positive number:");
	    Scanner input1 = new Scanner (System.in); // another new scanner
	    //check whether the input is integer or not
	    if(input1.hasNextInt()){
	         array[i] = input1.nextInt();//prompt the user to enter a number
             //check whether the number is positive or not
	         if(array[i]>0){
             i++;//if it is positive, increment of i 
             }    
             else{
            	 System.out.println("Sorry, the number you entered is negative."); 
             }
	    }
        else{
        	System.out.println("Sorry, the number you didn't enter an integer.");
        }
 
  }  
  
  System.out.println("The array is:");
  for(int j = 0; j<number;j++){
	  System.out.println(array[j]); //print out the array
  }
 	  
  }	//end of main method
}// end of class
