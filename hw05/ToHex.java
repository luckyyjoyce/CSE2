///////////////////////////
//Ruoting Li
//Feb 21st, 2015
//CSE002
//ToHex Java Program
//
//  first compile the program
//      javac ToHex.java
//  run the program
//      java ToHex

//first import
  import java.util.Scanner;
  
//define a class
  public class ToHex{

//add main method
  public static void main(String[ ] args) {

//input
  Scanner myScanner = new Scanner (System.in); //new number
  System.out.println("Please enter three numbers representing RGB values:");
  int firstDigit = 0; //first digit that enter
  int secondDigit = 0; //second digit that enter
  int thirdDigit = 0; //third digit that enter
  String first="0",second="0",third="0",fourth="0",fifth="0",sixth="0"; //six string number
  String s = ""; //new string

//Checking whether the first digit is a integer
  if (myScanner.hasNextInt()){
	  firstDigit = myScanner.nextInt();       
      //checking whether the digit is between 0 to 255
      if ((firstDigit>=0) &&(firstDigit<=255)){
      }
      //what will happen if it is not between 0 to 255
      else{
    	  System.out.println("Sorry, your must enter value between 0-255.");
      return;
      }
  }
//what will happen if it is not a integer
  else{
	  System.out.println("Sorry, your input must consist of integers.");
  return;
  }
  
//Checking whether the second digit is a integer  
  if (myScanner.hasNextInt()){
	  secondDigit = myScanner.nextInt();
	  //checking whether the digit is between 0 to 255
	  if ((secondDigit>=0) &&(secondDigit<=255)){   
	  }
	  //what will happen if it is not between 0 to 255
	  else{
		  System.out.println("Sorry, your must enter value between 0-255.");
	  return;
	  } 
  }
//what will happen if it is not a integer
  else{
	  System.out.println("Sorry, your input must consist of integers.");
  return;
  }

//Checking whether the third digit is a integer  
  if (myScanner.hasNextInt()){
	  thirdDigit = myScanner.nextInt();
	   //checking whether the digit is between 0 to 255
	  if ((thirdDigit>=0) &&(thirdDigit<=255)){   
	  }
	  //what will happen if it is not between 0 to 255
	  else{
		  System.out.println("Sorry, your must enter value between 0-255.");
	  return;
	  }
  }
//what will happen if it is not a integer  
  else{
	  System.out.println("Sorry, your input must consist of integers.");
  return;
  }
  
//Calculation
  int firstDivide = firstDigit / 16; //the result when first digit divided by 16
  int firstRemainder = firstDigit % 16; //the remainder when first digit divided by 16
  
  int secondDivide = secondDigit / 16; //the result when second digit divided by 16
  int secondRemainder = secondDigit % 16; //the remainder when second digit divided by 16
  
  int thirdDivide = thirdDigit / 16; //the result when third digit divided by 16
  int thirdRemainder = thirdDigit % 16; //the remainder when third digit divided by 16 
  
//when first digit more than 16
  if (firstDigit>16){
	  switch(firstDivide){
      case 1: first = "1"; break; //covert to 1
      case 2: first = "2"; break; //convert to 2
      case 3: first = "3"; break; //convert to 3      
      case 4: first = "4"; break; //convert to 4
      case 5: first = "5"; break; //convert to 5
      case 6: first = "6"; break; //convert to 6
      case 7: first = "7"; break; //convert to 7
      case 8: first = "8"; break; //convert to 8
      case 9: first = "9"; break; //convert to 9
      case 10: first = "A"; break; //convert to A
      case 11: first = "B"; break; //convert to B
      case 12: first = "C"; break; //convert to C
      case 13: first = "D"; break; //convert to D
      case 14: first = "E"; break; //convert to E
      case 15: first = "F"; break; //convert to F
      }
      switch(firstRemainder){
      case 1: second = "1"; break; //covert to 1
      case 2: second = "2"; break; //convert to 2
      case 3: second = "3"; break; //convert to 3 
      case 4: second = "4"; break; //convert to 4
      case 5: second = "5"; break; //convert to 5
      case 6: second = "6"; break; //convert to 6
      case 7: second = "7"; break; //convert to 7
      case 8: second = "8"; break; //convert to 8
      case 9: second = "9"; break; //convert to 9
      case 10: second = "A"; break; //convert to A
      case 11: second = "B"; break; //convert to B
      case 12: second = "C"; break; //convert to C
      case 13: second = "D"; break; //convert to D
      case 14: second = "E"; break; //convert to E
      case 15: second = "F"; break; //convert to F
      }
  }
//when first digit less than 16  
  else if (firstDigit<16){
	  first="0"; //the first string is 0
      second = s+firstDigit; //the second string is the same number as firstDigit
  }

//when second digit more than 16  
  if (secondDigit>16){
	  switch(secondDivide){
      case 1: third = "1"; break; //covert to 1
      case 2: third = "2"; break; //convert to 2
      case 3: third = "3"; break; //convert to 3    
      case 4: third = "4"; break; //convert to 4
      case 5: third = "5"; break; //convert to 5
      case 6: third = "6"; break; //convert to 6
      case 7: third = "7"; break; //convert to 7
      case 8: third = "8"; break; //convert to 8
      case 9: third = "9"; break; //convert to 9
      case 10: third = "A"; break; //convert to A
      case 11: third = "B"; break; //convert to B
      case 12: third = "C"; break; //convert to C
      case 13: third = "D"; break; //convert to D
      case 14: third = "E"; break; //convert to E
      case 15: third = "F"; break; //convert to F
      }
      switch(secondRemainder){
      case 1: fourth = "1"; break; //covert to 1
      case 2: fourth = "2"; break; //convert to 2
      case 3: fourth = "3"; break; //convert to 3     
      case 4: fourth = "4"; break; //convert to 4
      case 5: fourth = "5"; break; //convert to 5
      case 6: fourth = "6"; break; //convert to 6
      case 7: fourth = "7"; break; //convert to 7
      case 8: fourth = "8"; break; //convert to 8
      case 9: fourth = "9"; break; //convert to 9
      case 10: fourth = "A"; break; //convert to A
      case 11: fourth = "B"; break; //convert to B
      case 12: fourth = "C"; break; //convert to C
      case 13: fourth = "D"; break; //convert to D
      case 14: fourth = "E"; break; //convert to E
      case 15: fourth = "F"; break; //convert to F
      }
  }
 //when second digit less than 16 
  else if(secondDigit<16){
	  third="0"; //the third string is 0
      fourth = s+secondDigit; //the fourth string is the same number as secondDigit
  }

//when third digit more than 16  
  if (thirdDigit>16){
	  switch(thirdDivide){
      case 1: fifth = "1"; break; //covert to 1
      case 2: fifth = "2"; break; //convert to 2
      case 3: fifth = "3"; break; //convert to 3    
      case 4: fifth = "4"; break; //convert to 4
      case 5: fifth = "5"; break; //convert to 5
      case 6: fifth = "6"; break; //convert to 6
      case 7: fifth = "7"; break; //convert to 7
      case 8: fifth = "8"; break; //convert to 8
      case 9: fifth = "9"; break; //convert to 9
      case 10: fifth = "A"; break; //convert to A
      case 11: fifth = "B"; break; //convert to B
      case 12: fifth = "C"; break; //convert to C
      case 13: fifth = "D"; break; //convert to D
      case 14: fifth = "E"; break; //convert to E
      case 15: fifth = "F"; break; //convert to F
      }
      switch(thirdRemainder){
      case 1: sixth = "1"; break; //covert to 1
      case 2: sixth = "2"; break; //convert to 2
      case 3: sixth = "3"; break; //convert to 3     
      case 4: sixth = "4"; break; //convert to 4
      case 5: sixth = "5"; break; //convert to 5
      case 6: sixth = "6"; break; //convert to 6
      case 7: sixth = "7"; break; //convert to 7
      case 8: sixth = "8"; break; //convert to 8
      case 9: sixth = "9"; break; //convert to 9
      case 10: sixth = "A"; break; //convert to A
      case 11: sixth = "B"; break; //convert to B
      case 12: sixth = "C"; break; //convert to C
      case 13: sixth = "D"; break; //convert to D
      case 14: sixth = "E"; break; //convert to E  
      case 15: sixth = "F"; break; //convert to F
      }
  }
//when third digit less than 16  
  else if (thirdDigit<16){
	  fifth = "0"; //the fifth string is 0
      sixth = s + thirdDigit; //the sixth string is the same number as thirdDigit
  }
  
//print out the result  
  System.out.println("The decimal numbers R:" +firstDigit+ ", G:"+secondDigit+ ", B:"+thirdDigit+", is represented in hexidecimal as:"+first+second+third+fourth+fifth+sixth);
  
      
      
  }   //end of main method
}  //end of class 