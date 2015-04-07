///////////////////////////
//Ruoting Li
//Apr. 4th, 2015
//CSE002
//RemoveElements Java Program
//
//  first compile the program
//      javac RemoveElements.java
//  run the program
//      java RemoveElements

//first import
import java.util.Scanner;

//define a class
public class RemoveElements{
 
//add a main method
public static void main(String [] arg){
	Scanner scan=new Scanner(System.in); //new scanner
    int num[]=new int[10]; //declare and initialize a array with size 10
    int newArray1[]; //declare a new array
    int newArray2[]; //declare another new array
    int index,target; //declare two variables
	String answer=""; //declare a empty string
	do{
  	System.out.println("Random input 10 ints [0-9]");
  	num = randomInput(); //apply the method randomInput()
  	String out = "The original array is:"; //declare a string with some words
  	out += listArray(num); //add the string with the array
  	System.out.println(out); //print out the original array
 
  	System.out.print("Enter the index: ");
  	index = scan.nextInt(); //prompt the user to enter the index number
  	newArray1 = delete(num,index); //apply the method delete
  	String out1="The output array is "; //declare a string with some words
  	out1+=listArray(newArray1); //add the string with the array  
  	System.out.println(out1); //print out the string after applying method delete
 
    System.out.print("Enter the target value: ");
  	target = scan.nextInt(); //prompt the user to enter the target value
  	newArray2 = remove(num,target); //apply the method remove
  	String out2="The output array is "; //declare a string with some words
  	out2+=listArray(newArray2); //add the string with the array 
  	System.out.println(out2); //print out the string after applying the method remove
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-"); //ask the user whether to start again or not
  	answer=scan.next(); //prompt the user to enter the answer
	}while(answer.equals("Y") || answer.equals("y")); //do the loop if the user's answer is "y" or "Y"
  }//end of main method
 
//add a method called listArray 
public static String listArray(int num[]){
	String out="{"; //declare a string 
	//do a loop to add with the strings in the main method
	for(int j=0;j<num.length;j++){
  	    //what if j is more than 0
		if(j>0){
    	out+=", ";
  	    }
  	out+=num[j];
	}
	out+="} ";
	return out; //what will be returned after the method
  }//end of the method

//add a method called randomInput
public static int[] randomInput(){
	int array[] = new int [10]; //declare a new array with size 10
	//do a loop to make variable i goes from 0 to 9
	for(int i = 0;i<10;i++){
		array[i] = (int) (Math.random()*10); //give 10 numbers with random numbers between 0 and 9
	}
    return array; //return the array that is produced
}//end of the method

//add a method called delete
public static int[] delete(int[] a , int b){
	//what if the index b is not between 0 to 9
	if(b<0||b>9){
		System.out.println("The index is not valid.");
		return a; //return the original array
	}
	//all other cases
	else{
		System.out.println("Index "+b+" element is removed");
		int array[] = new int[9]; //declare a new array with size 9
		int i=0; //new variable i
		int j=0; //new variable j
		//start a loop when j less than 9
		while(j<=9){
			//what if j not equals to index b
			if(j!= b){
			array [i] = a[j]; //the new array number equals to the original one
			i++; //increment of i
			}
		j++; //increment of j
		}
		return array; //return the new array
	}
}//end of the method

//add a method called remove
public static int[] remove(int[] a, int b){
	int array[] = new int[0]; //declare a new array with size 0
	//use loop to check whether there is one number in the array fits target value
	for(int check = 0;check<10;check++){
		//what if the target value fits
		if(b==a[check]){
			System.out.println("Element "+b+" has been found.");
			int count = 0; //declare a new variable count
		    int k = 0; //declare a new variable k
		    //use a loop to check
		    while(k<10){
		    	//what if the target value equals to one element of the array
		    	if(b == a[k]){
		    		count++; //increment of count
		    	}
		    k++; //increment of k
		    }
			array = new int[10-count];//assign a new size to the array
			int i = 0; //declare a new variable i
			int j = 0; //declare a new variable j
			//use the loop to get final array
			while(j<10){
				//what if the element of original array does not equal to target value
				if(a[j] != b){
					array[i] = a[j]; //the element in the new array will equal to the one in the original one
					i++; //increment of i
				}
			j++; //increment of j
			}
			return array; //return the new array
		}
	}
			System.out.println("The target value is not valid.");//what will be print if no value in the original array equals to the target value 
		    return a; //if so, return the original array
		
}//end of the method

}//end of class
