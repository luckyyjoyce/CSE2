///////////////////////////
//Ruoting Li
//Apr. 26th, 2015
//CSE002
//FourDwin Java Program
//
//  first compile the program
//      javac FourDwin.java
//  run the program
//      java FourDwin


//define a class
public class LabThirteen{

//add a main method
public static void main (String[] args){
//first array
int a = 0;
int firstLength = a*3+5;
int [][] arrayOne = new int [1][firstLength];
for(int i =0;i<arrayOne.length;i++){
	for(int j = 0;j<arrayOne[i].length;j++){
		arrayOne[i][j] = (int)(Math.random()*40); 
	}
}//end of first array

//second array
int b = 1;
int secondLength = b*3+5;
int [][] arrayTwo = new int [1][secondLength];
for(int i =0;i<arrayTwo.length;i++){
	for(int j = 0;j<arrayTwo[i].length;j++){
		arrayTwo[i][j] = (int)(Math.random()*40); 
	}
}//end of second array

//third array
int c = 2;
int thirdLength = c*3+5;
int [][] arrayThree = new int [1][thirdLength];
for(int i =0;i<arrayThree.length;i++){
	for(int j = 0;j<arrayThree[i].length;j++){
		arrayThree[i][j] = (int)(Math.random()*40); 
	}
}//end of third array

//fourth array
int d = 3;
int fourthLength = d*3+5;
int [][] arrayFour = new int [1][fourthLength];
for(int i =0;i<arrayFour.length;i++){
	for(int j = 0;j<arrayFour[i].length;j++){
		arrayFour[i][j] = (int)(Math.random()*40); 
	}
}//end of fourth array

//fifth array
int e = 4;
int fifthLength = e*3+5;
int [][] arrayFive = new int [1][fifthLength];
for(int i =0;i<arrayFive.length;i++){
	for(int j = 0;j<arrayFive[i].length;j++){
		arrayFive[i][j] = (int)(Math.random()*40); 
	}
}//end of fifth array

//print the original arrays
System.out.println("The array before sorting:");
System.out.print("row 1: ");
printArray(arrayOne);
System.out.print("row 2: ");
printArray(arrayTwo);
System.out.print("row 3: ");
printArray(arrayThree);
System.out.print("row 4: ");
printArray(arrayFour);
System.out.print("row 5: ");
printArray(arrayFive);

//give a empty line
System.out.println();

//print the sorting arrays
System.out.println("The array after sorting:");
System.out.print("row 1: ");
arrayOne = insertionSort(arrayOne);
printArray(arrayOne);
System.out.print("row 2: ");
arrayTwo = insertionSort(arrayTwo);
printArray(arrayTwo);
System.out.print("row 3: ");
arrayThree = insertionSort(arrayThree);
printArray(arrayThree);
System.out.print("row 4: ");
arrayFour = insertionSort(arrayFour);
printArray(arrayFour);
System.out.print("row 5: ");
arrayFive = insertionSort(arrayFive);
printArray(arrayFive);

//give a empty line
System.out.println();

//combine all the arrays to a new one
int [][] newArray = new int[5][4*3+5];
for(int i = 0;i<arrayOne[0].length;i++){
	newArray[0][i] = arrayOne[0][i];  	
}
for(int i = 0;i<arrayTwo[0].length;i++){
	newArray[1][i] = arrayTwo[0][i];  	
}
for(int i = 0;i<arrayThree[0].length;i++){
	newArray[2][i] = arrayThree[0][i];  	
}
for(int i = 0;i<arrayFour[0].length;i++){
	newArray[3][i] = arrayFour[0][i];  	
}
for(int i = 0;i<arrayFive[0].length;i++){
	newArray[4][i] = arrayFive[0][i];  	
}
System.out.println("The array after sorting and copying:");
printArray(newArray);
}//end of the main method

//add a new method called printArray
public static void printArray(int [][] array){
	for(int i =0;i<array.length;i++){
		for(int j = 0;j<array[i].length;j++){
		    System.out.print(array[i][j]+" ");
		}
	System.out.println();
}
}//end of the method

//add a new method called insertionSort
public static int [][] insertionSort(int [][] array){
for(int i = 1;i<array[0].length;i++){
	for(int j = i-1;j>=0;j--){
		if(array[0][j+1]<=array[0][j]){
			int temp = array[0][j+1];
			array[0][j+1] = array[0][j];
			array[0][j] = temp;
		}
	}
}

return array;

}//end of the method


}//end of the class
