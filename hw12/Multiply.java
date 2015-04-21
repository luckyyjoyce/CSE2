///////////////////////////
//Ruoting Li
//Apr. 18th, 2015
//CSE002
//Multiply Java Program
//
//  first compile the program
//      javac Multiply.java
//  run the program
//      java Multiply

//first import
import java.util.Scanner;

//define a class
public class Multiply{

//add a method called randomMatrix
public static int [][] randomMatrix(int a, int b){
int [][] Matrix = new int[a][b]; //declare a new two dimensional array
//fill the matrix with random numbers
for(int row = 0; row < Matrix.length; row++){
	for(int column = 0; column < Matrix[row].length;column++){
	      Matrix[row][column] = (int)((Math.random()*21)-10);
	}
}
return Matrix; //return matrix
}//end of the method randomMatrix

//add a new method called matrixMultiply
public static int [][] matrixMultiply(int [][] firstMatrix, int [][] secondMatrix){
//check whether the two matrix can multiply together
if(firstMatrix[0].length != secondMatrix.length){
	System.out.println("Sorry, the two matrixes cannot multiply together.");    
    return null;
}
//what if the matrix can multiply together
else{
int [][] Matrix = new int [firstMatrix.length][secondMatrix[0].length]; //set a new matrix to be product of the original two matrixes
//fill the multiplication process using three for loops
for(int row = 0; row < Matrix.length; row++){
	for(int column = 0; column < Matrix[row].length; column++){
		int	total = 0;
		for(int number = 0; number < firstMatrix[0].length; number++){
		    total += firstMatrix[row][number] * secondMatrix[number][column]; //each number in the final Matrix	
		}
		Matrix[row][column] = total; //to change row or column for filling numbers in
	}
}
return Matrix; //return matrix
}
}//end of the method matrixMultiply
	
//add a main method
public static void main(String[] args){
int number1 = 0; //declare a variable number1
int number2 = 0; //declare a variable number2
int number3 = 0; //declare a variable number3
int number4 = 0; //declare a variable number4
boolean checkMultiplication = true; //declare a boolean to be true
//check whether the matrixes can undergo multiplication
while(checkMultiplication){
//first row number input
int check1 = 0; //declare a check1 to be 0
//when check1 equals to 0, start the loop
while(check1 == 0){
System.out.println("Enter the row number of the first matrix:");
Scanner input1 = new Scanner(System.in);
//check whether the input is an integer
if(input1.hasNextInt()){
	number1 = input1.nextInt();
	//check whether the input is more than 0
	if(number1>0){
	       check1 = 1; //what will be the value of check1 if the input fits all the requirements
	}
	//what if the number is not more than 0
	else{
		System.out.println("Sorry, the number input is not a positive number, please enter again.");
	}
}
//what if the number is not an integer
else{
	System.out.println("Sorry, the number input is not an integer,please enter again.");
}
}//end of the loop

//first column number input
int check2 = 0; //declare a check2 to be 0
//when check2 equals to 0, start the loop
while(check2 == 0){
System.out.println("Enter the column number of the first matrix:");
Scanner input2 = new Scanner(System.in);
//check whether the input is an integer
if(input2.hasNextInt()){
	number2 = input2.nextInt();
	//check whether the input is more than 0
	if(number2>0){
	       check2 = 1;//what will be the value of check2 if the input fits all the requirements	
	}
	//what if the number is not more than 0
	else{
		System.out.println("Sorry, the number input is not a positive number, please enter again.");
	}
}
//what if the number is not an integer
else{
	System.out.println("Sorry, the number input is not an integer,please enter again.");
}	
}//end of the loop

//second row number input
int check3 = 0; //declare a check3 to be 0
//when check3 equals to 0, start the loop
while(check3 == 0){
System.out.println("Enter the row number of the second matrix:");
Scanner input3 = new Scanner(System.in);
//check whether the input is an integer
if(input3.hasNextInt()){
    number3 = input3.nextInt();
    //check whether the input is more than 0
    if(number3>0){
	       check3 = 1;//what will be the value of check3 if the input fits all the requirements	
	}
    //what if the number is not more than 0
    else{
		System.out.println("Sorry, the number input is not a positive number, please enter again.");
	}
}
//what if the number is not an integer
else{
	System.out.println("Sorry, the number input is not an integer,please enter again.");
}
}//end of the loop

//second column number input
int check4 = 0; //declare a check4 to be 0
//when check4 equals to 0, start the loop
while(check4 == 0){
System.out.println("Enter the column number of the second matrix:");
Scanner input4 = new Scanner(System.in);
//check whether the input is an integer
if(input4.hasNextInt()){
	number4 = input4.nextInt();
	//check whether the input is more than 0
	if(number4>0){
	       check4 = 1; //what will be the value of check4 if the input fits all the requirements
	}
	//what if the number is not more than 0
	else{
		System.out.println("Sorry, the number input is not a positive number, please enter again.");
	}
}
//what if the number is not an integer
else{
	System.out.println("Sorry, the number input is not an integer,please enter again.");
}
}//end of the loop

//check whether the two matrix can multiplication or not
if(number2 == number3){
	checkMultiplication = false;
}
}//end of the boolean loop

int [][] firstMatrix = randomMatrix(number1, number2); //apply method randomMatrix to get first Matrix
int [][] secondMatrix = randomMatrix(number3, number4); //apply method randomMatrix to get second Matrix
//print out the first Matrix using loop
System.out.println("The first matrix is:");
for(int row = 0; row < firstMatrix.length; row++){
	  for(int column = 0; column < firstMatrix[row].length; column++){
		  System.out.print(firstMatrix[row][column]+" ");
	  }
      System.out.println();
}

System.out.println();

//print out the second Matrix using loop
System.out.println("The second matrix is:");
for(int row = 0; row < secondMatrix.length; row++){
	  for(int column = 0; column < secondMatrix[row].length; column++){
		  System.out.print(secondMatrix[row][column]+" ");
	  }
    System.out.println();
}
System.out.println();

//the final multiplication Matrix
int [][] finalMatrix = matrixMultiply(firstMatrix, secondMatrix); //apply the method matrixMultiply to get final product

//print out the final Matrix
System.out.println("The final product matrix is:");
for(int row = 0; row < finalMatrix.length; row++){
	  for(int column = 0; column < finalMatrix[row].length; column++){
		  System.out.print(finalMatrix[row][column]+" ");
	  }
  System.out.println();
}

}//end of main method	
}//end of the class
