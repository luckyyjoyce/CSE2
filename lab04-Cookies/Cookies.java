///////////////////////////
//Ruoting Li
//Feb 13rd, 2015
//CSE002
//Cookies Java Program
//
//  first compile the program
//      javac Cookies.java
//  run the program
//      java Cookies//

//first import
  import java.util.Scanner;
  
//define a class
  public class Cookies{

//add main method
  public static void main(String[ ] args) {

//input
  Scanner myScanner;
  myScanner = new Scanner (System.in);
  System.out.print("Enter the number of People:");
  int nPeople;
  
  if (myScanner.hasNextInt()){
      nPeople=myScanner.nextInt();
      if (nPeople>0) {
          System.out.print("Enter the number of cookies you are planning to buy:");
      }
      else {
      System.out.println("You did not enter an int > 0");
      }
  }
  else{
      System.out.println("You did not enter an int");
      return;
  }
  
  int nCookies=myScanner.nextInt();
  System.out.print("How many do you want each person to get?:");
  int nCookiesPerPerson=myScanner.nextInt();


  if (nCookies > (nPeople * nCookiesPerPerson)){
      if (nCookies % nPeople == 0){
          System.out.println("You have enough cookies for each person and the amount will divide evenly");
      }
      else if  (nCookies % nPeople > 0){
          System.out.println("You have enough, but they will not divide evenly.");
      }
  }
  else if (nCookies < (nPeople * nCookiesPerPerson)){
          System.out.println("You will not have enough cookies. You need to but at least " + ((nPeople * nCookiesPerPerson) - nCookies) + " more.");
          
  }

 }   //end of main method
}  //end of class 

