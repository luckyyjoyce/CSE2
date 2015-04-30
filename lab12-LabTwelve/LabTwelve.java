///////////////////////////
//Ruoting Li
//Apr. 11st, 2015
//CSE002
//LabTwelve Java Program
//
//  first compile the program
//      javac LabTwelve.java
//  run the program
//      java LabTwelve

//define a class
public class LabTwelve{

//add a main method
public static void main(String[] args){
//generate two random widths and heights
int randomWidthOne = (int)(Math.random()*6);
int randomWidthTwo = (int)(Math.random()*6);
int randomHeightOne = (int)(Math.random()*6);
int randomHeightTwo = (int)(Math.random()*6);

//generate three matrix A, B, C
int [][] A = new int[randomHeightOne][randomWidthOne];
int [][] B = new int[randomWidthOne][randomHeightOne];
int [][] C = new int[randomHeightTwo][randomWidthTwo];

//apply the method increasingMatrix
A = increasingMatrix(randomWidthOne,randomHeightOne, true);
B = increasingMatrix(randomWidthOne,randomHeightOne, false);
C = increasingMatrix(randomWidthTwo,randomHeightTwo, true);

//apply the method printMatrix
System.out.println("Generate an array with width "+randomWidthOne+" and height "+randomHeightOne);
printMatrix(A,true);

System.out.println("Generate an array with width "+randomWidthOne+" and height "+randomHeightOne);
printMatrix(B,false);

System.out.println("Generate an array with width "+randomWidthTwo+" and height "+randomHeightTwo);
printMatrix(C,true);

//apply the method addMatrix to add A and B
addMatrix(A,true,B,false);

//apply the method addMatrix to add A and C
addMatrix(A,true,C,true);


}//end of the main method

//add a new method called increasingMatrix
public static int [][] increasingMatrix(int width, int height, boolean format){
//when boolean is true, do row major array
if(format == true){
	int count = 0;
	int [][] arrayRow = new int[height][width];
	for(int i = 0;i<height;i++){
		for(int j = 0;j<width;j++){
			count++;
			arrayRow[i][j] = count;
		}
	}
return arrayRow;//return row major array when boolean is true
}
//when boolean is false, do column major array
else{
	int count = 0;
	int [][] arrayColumn = new int[width][height];
	for(int i = 0;i<height;i++){
		for(int j = 0;j<width;j++){
			count++;
			arrayColumn[j][i] = count;
		}
	}
return arrayColumn;
}//return column major array when boolean is true

}//end of the method increasingMatrix

//add a method called printMatrix
public static void printMatrix(int[][] array, boolean check){
//check whether the array is empty or not
if(array.length==0||array[0].length==0){
	System.out.println("The array is empty!");
}
else{
	//print the row major form
	if(check==true){
		for(int i = 0;i<array.length;i++){
			System.out.print("[");
			for(int j = 0;j<array[0].length;j++){
				System.out.print(array[i][j]+" ");
			}
		System.out.println("]");
		}
	}
	//print the column major form
	else if(check==false){
		for(int i = 0;i<array[0].length;i++){
			System.out.print("[");
			for(int j = 0;j<array.length;j++){
				System.out.print(array[j][i]+" ");
			}
		System.out.println("]");
		}
	}
}
}//end of the method printMatrix

//add a method called translate
public static int[][] translate(int[][] array){
if(array.length==0||array[0].length==0){
	System.out.println("The array is empty");
    return null;
}
else{
int [][] newArray = new int [array[0].length][array.length];
for(int i = 0;i<newArray.length;i++){
	for(int j = 0;j<newArray[0].length;j++){
		newArray[i][j] = array[j][i];
	}
}
return newArray;
}
}//end of the method translate

//add a method called addMatrix
public static void addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb){ 
int heightA;
int widthA;
int heightB;
int widthB;
int[][] arrayOne;
int[][] arrayTwo;

//check whether the array is row major and if not translate to row major 
if(formata == true){
	arrayOne = a;
}
else{
	arrayOne = translate(a);
}

//check whether the array is row major and if not translate to row major 
if(formatb == true){
	arrayTwo = b;
}
else{
	arrayTwo = translate(b);
}

//check whether the two arrays can add or not
if(arrayOne.length!=0&&arrayOne[0].length!=0&&arrayTwo.length!=0&&arrayTwo[0].length!=0){
	heightA = arrayOne.length;
	widthA = arrayOne[0].length;
	heightB = arrayTwo.length;
	widthB = arrayTwo[0].length;
	//check whether the two arrays can add or not
	if(widthA==widthB && heightA == heightB){
		System.out.println("Adding two matrixes.");
		printMatrix(a,formata);
		System.out.println("plus");
		printMatrix(b,formatb);
		System.out.println("translating column major to row major:");
		System.out.println("Output:");
		int[][] newMatrix = new int[heightB][widthB];
		for(int i =0;i<heightB;i++){
			for(int j=0;j<widthB;j++){
				newMatrix[i][j] = arrayOne[i][j]+arrayTwo[i][j];
			}
		}
	    printMatrix(newMatrix,true);
	}
	//what if they cannot be added
	else{
		System.out.println("The arrays cannot be added!");
	}
}
//what if they cannot be added
else{
	System.out.println("The arrays cannot be added!");
}
}//end of the method addMarix

}//end of the class