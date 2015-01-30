///////////////////////////
//Ruoting Li
//Jan 30th, 2015
//CSE002
//Cyclometer Java Program
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{

//  add main method
  public static void main(String[ ] args) {
      
//  my input data
    int secsTrip1=480;  //the seconds for the first trip
    int secsTrip2=3220;  //the seconds for the second trip
    int countsTrip1=1561;  //the counts for the first trip
    int countsTrip2=9037;  //the counts for the second trip

    double wheelDiameter=27.0, 
  	PI=3.14159, 
  	feetPerMile=5280,  
  	inchesPerFoot=12,   
  	secondsPerMinute=60;  
	double distanceTrip1, distanceTrip2,totalDistance;  
	
	System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had " + countsTrip1 + " counts.");
	System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had " + countsTrip2 + " counts.");
	
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
    //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");

  }   //end of main method
}  //end of class 
