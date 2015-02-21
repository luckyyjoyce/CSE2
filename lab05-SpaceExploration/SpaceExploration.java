///////////////////////////
//Ruoting Li
//Feb 21st, 2015
//CSE002
//SpaceExploration Java Program
//
//  first compile the program
//      javac SpaceExploration.java
//  run the program
//      java SpaceExploration

//define a class
  public class SpaceExploration{

//add main method
  public static void main(String[ ] args) {
  
  int year = 2000 + (int)(Math.random() * 11); //random select year from 2000 to 2010

  System.out.println("Here is the timeline of space exploration events from "+ year + " to 2000:");
  
  switch(year){
  case 2010: System.out.println("2010: SpaceX successfully sends space craft to orbit and back"); //the event happen when year is 2010 
  case 2009: System.out.println("2009: N/A"); //the event happen when year is 2009
  case 2008: System.out.println("2008: Kepler launched to study deep space"); //the event happen when year is 2008
  case 2007: System.out.println("2007: N/A"); //the event happen when year is 2007
  case 2006: System.out.println("2006: Spacecraft returns with collections from a comet"); //the event happen when year is 2006
  case 2005: System.out.println("2005: Spacecraft collies with comet"); //the event happen when year is 2005
  case 2004: System.out.println("2004: N/A"); //the event happen when year is 2004
  case 2003: System.out.println("2003: Largest infrared telescope released"); //the event happen when year is 2003
  case 2002: System.out.println("2002: N/A"); //the event happen when year is 2002
  case 2001: System.out.println("2001: First spacecraft lands on asteroid"); //the event happen when year is 2001
  case 2000: System.out.println("2000: First spacecraft orbits an asteroid"); break; //the event happen when year is 2000
  default: System.out.println("It is not within the decade"); //when the random number does not belong to the decade
  }
      
      
  } //end of method

} //end of class
