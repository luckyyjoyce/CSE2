///////////////////////////
//Ruoting Li
//Apr. 28th, 2015
//CSE002
//FourDwin Java Program
//
//  first compile the program
//      javac FourDwin.java
//  run the program
//      java FourDwin

//first import
import java.util.Scanner;

//define a class
public class FourDwin{

//add a main method
public static void main (String[] args){
int check = 0; //declare a variable
int check1 = 0;//declare a variable
int x = 0;//declare a variable
int y = 0;//declare a variable
//use loop to ask user to enter again if not suitable
while(check==0){
System.out.print("Enter an integer X:");
Scanner input = new Scanner(System.in); //new Scanner
//check whether the user enter an integer or not
if(input.hasNextInt()){
	x = input.nextInt(); //prompt the user to enter
    check = 1; //change the variable to stop the loop when the number is right
}
//what will print if the number enter is not an integer
else{
	System.out.println("Invalid input.");	
}
}//end of the loop
//use loop to ask user to enter again if not suitable
while(check1==0){
System.out.print("Enter an integer Y where Y>X:");
Scanner input1 = new Scanner(System.in); //new Scanner
//check whether the user enter an integer or not
if(input1.hasNextInt()){
	y = input1.nextInt();//prompt the user to enter
    //check whether y is more than x
	if(y>x){
    	check1 = 1;//change the variable to stop the loop when the number is right
    }
    //what will print if y is not more than x
	else{
    	System.out.println("Invalid input.");
    }
}
//what will print if the number enter is not an integer
else{
	System.out.println("Invalid input.");
}
}//end of the loop

int a = (int)(Math.random()*(y-x))+x+1; //set random size to 3D
int b = (int)(Math.random()*(y-x))+x+1;//set random size to 2D
int c = (int)(Math.random()*(y-x))+x+1;//set random size to single D
double [][][][] array = new double[3][a][b][c]; //declare the array

//use loop to set the elements for the 4D array
for(int i = 0;i<3;i++){
	array[i] = new double [(int)(x+Math.random()*(y-x+1))][][];
	for(int j = 0;j<array[i].length;j++){
		array[i][j] = new double [x+(int)(Math.random()*(y-x+1))][];
		for(int k = 0;k<array[i][j].length;k++){
			array[i][j][k] = new double [(int)(x+Math.random()*(y-x+1))];
			for(int f = 0;f<array[i][j][k].length;f++){
				array[i][j][k][f] = (double)(Math.random()*30);
			}
		}
	}
}//end of the loop

//apply the method printArray to display the array
System.out.println();
System.out.println("Original Array:");
printArray(array);
System.out.println();

//apply the method sort3DArray
double [][][][] firstNewArray = sort3DArray(array);

//apply the method sort4DArray
System.out.println();
System.out.println("Sorted array:");
double [][][][] secondNewArray = sort4DArray(array);
printArray(secondNewArray);
System.out.println();

//apply the method statArray 
System.out.println();
statArray(secondNewArray);

}//end of the main method

//add a method called printArray
public static void printArray(double [][][][] array){
System.out.print("{");
for(int i = 0;i<3;i++){
	System.out.print("{");
    for(int j = 0;j<array[i].length;j++){
    	//what if j equals to 0
    	if(j==0){
    	System.out.print("{");
    	}
    	else{
    		System.out.print(",{");
    	}
        for(int k = 0;k<array[i][j].length;k++){
        	//what if k equals to 0
        	if(k==0){
            	System.out.print("{");
            	}
            	else{
            		System.out.print(",{");
            	}
        	for(int f = 0; f<array[i][j][k].length;f++){
        		//what if f equals to 0
        		if(f==0){
        		System.out.printf("%4.1f",array[i][j][k][f]);
        		}
        		else{
        			System.out.printf(","+"%4.1f",array[i][j][k][f]);
        		}
        	}
        	System.out.print("}");
        }
        System.out.print("}");
    }
   //what if i equals to 2, since the most size is 3
    if(i==2){
		System.out.print("}");
	}
	else{
		System.out.print("},");
	}
}
System.out.print("}");
}//end of the method printArray

//add a method called statArray
public static void statArray(double [][][][] array){
double result = 0;
int count = 0;
//use loop to calculate the sum of the elements in the 4D array
for(int i = 0;i<3;i++){
	for(int j = 0;j<array[i].length;j++){
		for(int k = 0;k<array[i][j].length;k++){
			for(int f = 0;f<array[i][j][k].length;f++){
				result += array[i][j][k][f];
				count++;
			}
		}
	}
}//end of the loop
System.out.println("Members:" + count);
System.out.printf("Sum:" + "%4.1f",result);
System.out.println();
System.out.printf("Mean:"+"%4.1f",(result/count));

}//end of the method statArray

//add a method called sort3DArray using selection sort
public static double[][][][] sort3DArray(double[][][][] array){
	for(int i = 0;i<3;i++){
		for(int j = 0;j<array[i].length;j++){
			for(int k = 0;k<array[i][j].length;k++){
				for(int f = 0;f<array[i][j][k].length;f++){
					for(int g = f+1;g<array[i][j][k].length;g++)
					 if(array[i][j][k][f]>array[i][j][k][g]){
						 double temp = array[i][j][k][f]; //declare the temp to store value
						 array[i][j][k][f] = array[i][j][k][g]; //swap
						 array[i][j][k][g] = temp;  //swap
					 }
				}
			}
		}
	}//end of the loop	
return array;
}//end of the method sort3DArray

//add a method called sort4DArray using insertion sort
public static double[][][][] sort4DArray(double[][][][] array){
//use the loop to check every selected number
for(int i = 1;i<array.length;i++){
	int sizeOne = 0; //declare variable size
	double minOne = 100; //declare variable minOne
	for(int j = 0;j<array[i].length;j++){
		for(int k = 0;k<array[i][j].length;k++){
			for(int f = 0;f<array[i][j][k].length;f++){
				sizeOne++; //to count the size of the selected 3D array
				//what if the array member is less than minOne
				if(array[i][j][k][f]<minOne){
					minOne = array[i][j][k][f]; //minOne is equal to that member
				}
			}
		}
	}//end of the second loop

int check; //declare a variable check used for insertion sort
double[][][] secondArray = array[i]; //declare the selected array name secondArray

//apply the method insertion sort to compare each 3D array before the selected ones
for(check = i-1;check>=0;check--){
	int sizeTwo = 0; //declare variable size
	double minTwo = 100;//declare variable minTwo
	//use the loop as just now to count size and find minimum values
	for(int a = 0;a<array[check].length;a++){
	    for(int b = 0;b<array[check][a].length;b++){
	    	for(int c = 0; c<array[check][a][b].length;c++){
	    		sizeTwo++; //count the size of the array before the selected one
	    		if(array[check][a][b][c]<minTwo){
	    			minTwo=array[check][a][b][c]; //find the minimum value of the array before the selected one
	    		}
	    	}
	    }
	}//end of the second loop 

//what if the size of the before one is greater than selected one
if(sizeTwo>sizeOne){
	array[check+1] = array [check]; //swap the selected one with the checking one
}
//what if the size of the before one is equal to the selected one
else if(sizeTwo == sizeOne){
	//when the minimum value of checking one is greater than the selected one
	if(minTwo>minOne){
		array[check+1] = array[check];//swap the selected one with the checking one
	}
	//other situation
	else{
		break;//break the loop
	}
}
//other situation
else{
	break; //break the loop
}

}//end of the checking loop

array[check+1]=secondArray; //set new selected array

}//end of the overall loop

return array; //return the array to the main method

}//end of the method sort4DArray

}//end of the class

