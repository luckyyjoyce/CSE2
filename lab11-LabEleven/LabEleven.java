///////////////////////////
//Ruoting Li
//Apr. 11st, 2015
//CSE002
//LabEleven Java Program
//
//  first compile the program
//      javac LabEleven.java
//  run the program
//      java LabEleven

//first import
import java.util.Scanner;

//define a class
public class LabEleven{

//add a main method
public static void main(String[] args){
int [] firstArray = new int[100]; //declare the first array	
int [] secondArray = new int[101]; //declare the second array

//fill values in the first array
for(int i = 0;i<firstArray.length;i++){
	firstArray[i] = (int)(Math.random()*101); 
}
linearSearch(firstArray);//apply the method linearSearch here

secondArray [0] = 0;//set the first value in the second array

//fill values in the second array
for(int i = 1;i<secondArray.length;i++){
	secondArray[i] = (int)(secondArray[i-1]+(Math.random()*100));
}
System.out.println("The maximum of array2 is: "+secondArray[100]); //find the maximum value in second array
System.out.println("The minimum of array2 is: "+secondArray[1]); //find the minimum value in the second array

System.out.print("Enter an int:");
int number = 0; //declare a variable
Scanner input = new Scanner(System.in); //new scanner
//check whether the number is an integer
if(input.hasNextInt()){
      number = input.nextInt(); //prompt the user to enter an integer
      //check whether the number is more than 0
      if(number>=0){
    	  binarySearch(secondArray,number); //apply the method binarySearch 
      }
      //what if not
      else{
    	  System.out.println("You did not enter an int >= 0.");
      }
}
//what if not
else{
	System.out.println("You did not enter an integer.");	
}

}//end of the main method

//add a new method linearSearch
public static void linearSearch(int[] firstArray){
int max = firstArray[0]; //declare a variable max
int min = firstArray[0]; //declare a variable min

//loop to find the max and min
for(int i = 0; i<firstArray.length;i++){
	if(max<firstArray[i]){
		max = firstArray[i];
	}
	else if(min>firstArray[i]){
		min = firstArray[i];
	}
}
System.out.println("The maximum of array1 is: "+max);
System.out.println("The minimum of array1 is: "+min);

}//end of the method linearSearch

//add a new method binarySearch
public static void binarySearch(int[] secondArray, int number){
int low = 1; //declare a variable low
int high = secondArray.length-1; //declare a variable high
//loop to find whether the number is in the list
while(high>=low){
	int mid = (high+low)/2;
	if(number>secondArray[mid]){
		low = mid+1;
	}
	else if(number==secondArray[mid]){
		System.out.println(number + " was found in the list.");
	    break;
	}
	else{
		high = mid-1;
	}
}
//if the key is not in the list, what is the number above and below the key
while(high<low){
System.out.println(number + " was not found in the list.");
System.out.println("The number above the key was "+secondArray[low]);
System.out.println("The number below the key was "+secondArray[high]);
break;
}
}//end of the method binarySearch

}//end of the class

