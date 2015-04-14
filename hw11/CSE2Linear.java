///////////////////////////
//Ruoting Li
//Apr. 11st, 2015
//CSE002
//CSE2Linear Java Program
//
//  first compile the program
//      javac CSE2Linear.java
//  run the program
//      java CSE2Linear

//first import
import java.util.Scanner;

//define a class
public class CSE2Linear{

//add a main method
public static void main(String[] args){
	int[] array = new int[16]; //declare the array
	int i = 1; //declare a new variable i 
	System.out.println("Enter 15 ints for final grades in CSE2:");
	//use loop to prompt user to enter integer in an array
	while(i<16){	
		Scanner input = new Scanner(System.in);	//new Scanner
		//check whether the number is an integer or not 
		if(input.hasNextInt()){
		array[0]=0; //set array 0 to 0 to let each number in the array is larger than the number before it
		array[i] = input.nextInt(); //prompt the user to enter a number
	       //check whether the number in the array is between 0 and 100
		   if(array[i]<=100 && array[i]>=0){
	              //check whether the number after is larger than the number before
			      if(array[i]>=array[i-1]){
	    	          i++; //let user to prompt value for another array number
	              }
	              //what will be print out if the requirement is not achieved
			      else{
	    	      System.out.println("The number is not greater or equal to the last one.");
	              }
	       }
		   //what will be print out if the requirement is not achieved
	       else{
	    	System.out.println("The number is out of the range 0-100.");
	       }
	    }
		//what will be print out if the requirement is not achieved
		else{
		System.out.println("The number is not an integer.");
	    }
    }
	System.out.print("The grades, sorted, are:");
	  //do a loop to print out the array
	  for(int j = 1; j<16;j++){
		  System.out.print(array[j]+" ");
	  }
	System.out.println();
	System.out.print("Enter a grade to search for:");
	Scanner input1 = new Scanner (System.in); //new scanner
    int a = input1.nextInt(); //prompt the user to enter an integer
	binarySearch(array, a); //apply the method binarySearch
	System.out.println("Scrambled:");
    int [] newArray = seletionSort(array); //let the new array equals to the original array
	System.out.println();
    System.out.print("Enter a grade to search for:");
	int b = input1.nextInt(); //prompt the user to enter an integer
	linearSearch(newArray,b); //apply the method linearSearch
}//end of main method


//add a new method named binarySearch
public static void binarySearch(int[] array, int number){
int low = 1; //declare a variable low
int high = array.length-1; //declare a variable high
int count = 0; //declare a variable count
int count1 = 1; //declare a variable count1
//start the loop while high is more than low
while(high>=low){
	count++; //increment of count
	int mid = (low + high) / 2; //declare a variable mid
	//what is the number is less than the array[mid]
	if(number<array[mid]){
		high = mid - 1; //high equals to mid minus 1
	}
	//what if the number equals to the array[mid]
	else if(number == array[mid]){
		System.out.println(number + " was found in the list with " + count + " iterations." );
		count1=2; //let count1 to be 2
		break; //break the loop
	}
	//other situations
	else{
		low = mid + 1; //low equals to mid plus 1
	}
	}
//what if count1 is not 2
if (count1 != 2){
	System.out.println(number + " was not found in the list with " + count + " iterations." );		
}
}//end of the method

//add a new method named selectionSort
public static int[] seletionSort(int[] array){
//run the loop 
for(int i = 1; i<array.length;i++){
	int j = (int)(Math.random()*array.length-1)+1; //let j to be a random number between 1 and 16
	int middleNumber = array[i]; //declare a variable middleNumber
	array[i] = array[j]; //swap the number in th array 
	array[j] = middleNumber; //swap the number in the array
}
//run the loop to print out the new array
for(int k = 1;k<16;k++){
	System.out.print(array[k]+" ");
}
return array; //return the new array
}//end of the method

//add a new method named linearSearch
public static void linearSearch(int[] array, int number){
	int count = 0; //declare a variable count
	int count1 = 1; //declare a variable count1
	//run the loop
	for(int i = 1; i<array.length;i++){
		count++; //increment if count
		//what if the number equals to the array[i]
		if(number == array[i]){
		System.out.println(number + " was found in the list with " + count + " iterations.");	
		count1 = 2; //count1 equals to 2
		break; //break the loop
		}
	}
	//what if count1 is not equal to 2
	if(count1 != 2){
    System.out.println(number + " was not found in the list with " + count + " iterations.");
	}
}//end of method	
}//end of class