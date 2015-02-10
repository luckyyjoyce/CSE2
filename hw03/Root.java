///////////////////////////
//Ruoting Li
//Feb 6th, 2015
//CSE002
//Root Java Program
//
//  first compile the program
//      javac Root.java
//  run the program
//      java Root//

//first import
  import java.util.Scanner;
  
//define a class
  public class Root{

//add main method
  public static void main(String[ ] args) {

//inputs      
  Scanner myScanner;
  myScanner=new Scanner(System.in);
  System.out.print("Enter the number of X:");
  double X=myScanner.nextDouble();
  
//variables
  double guess; //the square root
 
//Calculation
  guess=X/3; //methos to calculate guess
 
  guess=(2*guess*guess*guess+X)/(3*guess*guess); // improve guess for the first time
 
  guess=(2*guess*guess*guess+X)/(3*guess*guess); // improve guess for the second time
  
  guess=(2*guess*guess*guess+X)/(3*guess*guess); // improve guess for the third time
  
  guess=(2*guess*guess*guess+X)/(3*guess*guess); // improve guess for the fourth time
  
  guess=(2*guess*guess*guess+X)/(3*guess*guess); // improve guess for the fifth time
  
  System.out.println("The cubic root is:"+guess);

  }   //end of main method
}  //end of class 