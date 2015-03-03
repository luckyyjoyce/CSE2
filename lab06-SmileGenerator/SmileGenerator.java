///////////////////////////
//Ruoting Li
//Feb 27th, 2015
//CSE002
//SmileGenerator Java Program
//
//  first compile the program
//      javac SmileGenerator.java
//  run the program
//      java SmileGenerator

//define a class
  public class SmileGenerator{

//add main method
  public static void main(String[ ] args) {
  
  System.out.println(":):):):):)");
  
  int counter = 0;
  while (counter < 5){
      System.out.print(":)");
      counter++;
  }
  System.out.println();
  
  int counter1 = 0;
  do{
     System.out.print(":)");
     counter1++;
  } while (counter1 < 5);
  System.out.println();
  
  double counter2=1+Math.random()*99;   
  int counter3 = (int) counter2;
  while (counter3 < 100){
     System.out.print(":)");
     counter3++;
  }
  System.out.println();
   
  String smile = ":)";
  int counter4 = 0;
  while (counter4 < 4){
    System.out.println(smile);  
    smile=smile+":)";
    counter4++;
  }
      
  } //end of method

} //end of class
