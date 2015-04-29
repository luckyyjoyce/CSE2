///////////////////////////
//Ruoting Li
//Apr. 1st, 2015
//CSE002
//Lab9 Java Program
//
//  first compile the program
//      javac LabNine.java
//  run the program
//      java LabNine

//first import
import java.util.Random;

//define a class
public class LabNine{

//add a main method
public static void main(String[] args){
System.out.println("The "+methodOne()+" "+methodOne()+" "+methodTwo()+" "+methodThree()+" the "+methodOne()+" "+methodFour());
}//end of the main method

//add a new method called methodOne
public static String methodOne(){
	String adjective = "";//declare a string
	Random randomGenerator = new Random();//new Random
	int randomInt = randomGenerator.nextInt(10);//generate random number from 0 to 9
	//use switch statement to generate the result string
	switch(randomInt){
	case 0: adjective += "pretty"; break;
	case 1: adjective += "ugly"; break;
	case 2: adjective += "funny"; break;
	case 3: adjective += "beautiful"; break;
	case 4: adjective += "lazy"; break;
	case 5: adjective += "friendly"; break;
	case 6: adjective += "honest"; break;
	case 7: adjective += "tall"; break;
	case 8: adjective += "smart"; break;
	case 9: adjective += "purple"; break;
	default: break; 
	}
return adjective;//return the string to the main method
}//end of the method

//add a new method called methodTwo
public static String methodTwo(){
	String subject = "";//declare a string
	Random randomGenerator = new Random();//new Random
	int randomInt = randomGenerator.nextInt(10);//generate random number from 0 to 9
	//use switch statement to generate the result string
	switch(randomInt){
	case 0: subject += "fox"; break;
	case 1: subject += "elephant"; break;
	case 2: subject += "fish"; break;
	case 3: subject += "wolf"; break;
	case 4: subject += "child"; break;
	case 5: subject += "dog"; break;
	case 6: subject += "cat"; break;
	case 7: subject += "boy"; break;
	case 8: subject += "rabbit"; break;
	case 9: subject += "girl"; break;
	default: break; 
	}
return subject;//return the string to the main method
}//end of the method

//add a new method called methodThree
public static String methodThree(){
	String verb = "";//declare a string
	Random randomGenerator = new Random();//new Random
	int randomInt = randomGenerator.nextInt(10);//generate random number from 0 to 9
	//use switch statement to generate the result string
	switch(randomInt){
	case 0: verb += "passed"; break;
	case 1: verb += "helped"; break;
	case 2: verb += "chased"; break;
	case 3: verb += "bought"; break;
	case 4: verb += "used"; break;
	case 5: verb += "brought"; break;
	case 6: verb += "thought"; break;
	case 7: verb += "brought"; break;
	case 8: verb += "played"; break;
	case 9: verb += "jumped"; break;
	default: break; 
	}
return verb;//return the string to the main method
}//end of the method

//add a new method called methodFour
public static String methodFour(){
	String object = ""; //declare a string 
	Random randomGenerator = new Random(); //new Random
	int randomInt = randomGenerator.nextInt(10); //generate random number from 0 to 9
	//use switch statement to generate the result string
	switch(randomInt){
	case 0: object += "pencil"; break;
	case 1: object += "dog"; break;
	case 2: object += "cell phone"; break;
	case 3: object += "cup"; break;
	case 4: object += "bird"; break;
	case 5: object += "bag"; break;
	case 6: object += "book"; break;
	case 7: object += "bed"; break;
	case 8: object += "card"; break;
	case 9: object += "shoes"; break;
	default: break; 
	}
return object; //return the string to the main method
}//end of the method

}//end of the class