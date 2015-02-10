///////////////////////////
//Ruoting Li
//Feb 6th, 2015
//CSE002
//FourDigits Java Program
//
//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//

//first import
  import java.util.Scanner;
  
//define a class
  public class FourDigits{

//add main method
  public static void main(String[ ] args) {
//inputs  
  Scanner myScanner;
  myScanner=new Scanner(System.in);
  System.out.print("Enter a double:");
  double x=myScanner.nextDouble();

//Variables
  double x1; //the number of x*10000
  
  x1=x*10000; //x1 is x times 10000
  int y=(int) x; //the integer part of x
  y=y*10000; //integer part of x times 10000
  double z= x1-y;//the four digits after the decimal point
  int A= (int) z; // integer the number
  
  if (A>=999&&A<10000) {
      System.out.println("The four digits are:"+A);
  }
  
  if (A>=99&&A<999) {
      System.out.println("The four digits are:0"+A);
  }
  
  if (A>=9&&A<99) {
      System.out.println("The four digits are:00"+A);
  }
  
  if (A>=0&&A<9) {
      System.out.println("The four digits are:000"+A);
  }
  
  
  }   //end of main method
}  //end of class 
