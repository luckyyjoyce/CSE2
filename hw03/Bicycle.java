///////////////////////////
//Ruoting Li
//Feb 6th, 2015
//CSE002
//Bicycle Java Program
//
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle//

//first import
  import java.util.Scanner;
  
//define a class
  public class Bicycle{

//add main method
  public static void main(String[ ] args) {

//inputs      
  Scanner myScanner;
  myScanner=new Scanner(System.in);
  System.out.print("Enter the number of seconds:");
  int nSeconds=myScanner.nextInt();
   
  System.out.print("Enter the number of counts:");
  int nCounts=myScanner.nextInt();
  
//known variables
  double wheelDiameter=27.0, //the diameter of the wheel
  PI=3.14159, //the constant number of pi
  feetPerMiles=5280, //the transfer between feet and mile
  inchesPerFoot=12, //the transfer between feet and inch
  secondsPerMinute=60, //the transfer between seconds and minutes
  minutesPerHour=60; //the transfer between minutes and hours

//unknown variables
  double distance3; // the distance traveled by the cyclometer originally
  double timeinMinutes; //the time of travel in minutes
  double averageMPM; //the average miles per minute
  double averageMPH; //the average miles per hour
  double distance; //the distance travelled
//calculation 1
  distance3= nCounts*wheelDiameter*PI; //the distance in inches
  distance3/=inchesPerFoot*feetPerMiles;//converts to distances in miles
  distance= distance3*100;
  int distance1=(int) distance;
  double distance2= distance1/100.0;
  timeinMinutes=nSeconds/secondsPerMinute; //the travelled time is minutes
  
  System.out.println("The distance was "+ distance2 +" miles and took "+ timeinMinutes +" minutes.");
  
//calculation 2
  averageMPH=distance3/(nSeconds/(secondsPerMinute*minutesPerHour)); //converts to miles per hour
  averageMPH=averageMPH*100;
  int averageMPH1=(int) averageMPH;
  double averageMPH2= averageMPH1/100.0;
  System.out.println("The average mph was"+averageMPH2);
  
  }   //end of main method
}  //end of class 
