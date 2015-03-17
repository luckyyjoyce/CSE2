///////////////////////////
//Ruoting Li
//Mar 1st, 2015
//CSE002
//GetIntegers Java Program
//
//  first compile the program
//      javac zigzag.java
//  run the program
//      java zigzag

//first import
  import java.util.Scanner;
  
//define a class
  public class zigzag{

//add main method
  public static void main(String[ ] args) {

  int nStars = 10;
  int stars = 0;
  while(stars<nStars){
	  System.out.print("*");
	  stars++;
  }
  System.out.println("");
  
  for(int star= 1;star<=nStars;star++){
		  System.out.println("*");
		  for(int space=1; space<=star; space++){
		  System.out.print(" ");
	      }
  }
  System.out.println("");
 
  while(true){
  System.out.print("Enter an int between 3 and 33:");
 
  Scanner myScanner = new Scanner(System.in);  
  if (myScanner.hasNextInt()){
	     int number = myScanner.nextInt();
	     if (number>=3 && number<=33){
	     for (int nStarts=1; nStarts<=number;nStarts++){
	    	 System.out.print("*");
	     }
	     System.out.println("");
	     for(int space=1;space<number-1;space++){
			 for(int Star=1; Star<=space;Star++){
			 System.out.print(" ");
			 }
			 System.out.print("*");
			 System.out.println("");
	     }
	     for (int nStarts1=1; nStarts1<=number;nStarts1++){
	    	 System.out.print("*");
	     }
	     }
	     else{
	    	 System.out.println("The number is out of range [3,33]."); 
	     }
  }
  else{
     System.out.println("The number is not an integer.");
  }
  
  System.out.println("");
  System.out.print("Enter y or Y to do again:");
  Scanner myScanner1 = new Scanner(System.in); 
  String doAgain = myScanner1.nextLine();
  char ch = doAgain.charAt(0);
  if (ch == 'y' || ch == 'Y'){  
  }
  else{
	  break;
  }
  }
  
  }//end of method
 }//end of class