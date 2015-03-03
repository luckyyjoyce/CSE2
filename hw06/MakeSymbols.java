///////////////////////////
//Ruoting Li
//Mar 1st, 2015
//CSE002
//MakeSymbols Java Program
//
//  first compile the program
//      javac MakeSymbols.java
//  run the program
//      java MakeSymbols

  
//define a class
  public class MakeSymbols{

//add main method
  public static void main(String[ ] args) {
  
  int number = (int)(Math.random()*101); //to get a random number between 0 and 100
  System.out.println("Random number generated:"+number); //print out the number generated
  
  String star = "*"; //declare string star
  String and = "&"; //declare string and
  int counter = -1; //declare and initialize the counter
  int counter1 = -1; //declare and initialize the counter1
  
  if(number % 2 == 0){
     do{
       star = star + "*"; //add one more star when add one number to the original one if the number is an even number
       counter++; //increment of the counter
     } while(counter < (number-2)); //when counter less than (number-2)  
  System.out.print("The output pattern:"+star); //print out the numbers of stars
  }
  
  else if (number % 2 != 0){
     do{
       and = and + "&"; //add one more and when add one number to the original one if the number is an odd number
       counter1++; //increment of the counter1
     } while(counter1 < (number-2)); //when counter1 less than (number-2)
  System.out.print("The output pattern:"+and); //print out the numbers of and
  }
  
  System.out.println(); //print out to a new line of command
  }   //end of main method
}  //end of class 
      
      
      