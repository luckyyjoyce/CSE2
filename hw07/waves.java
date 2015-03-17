///////////////////////////
//Ruoting Li
//Mar 15th, 2015
//CSE002
//waves Java Program
//
//  first compile the program
//      javac waves.java
//  run the program
//      java waves

//first import
  import java.util.Scanner;
  
//define a class
  public class waves{

//add main method
  public static void main(String[ ] args) {
	  System.out.print("Enter a number between 1 and 30:"); //prompt the user to enter a number
	  
	  Scanner myScanner = new Scanner(System.in);  
	  if (myScanner.hasNextInt()){
		     int n = myScanner.nextInt(); //check whether the number a integer or not
		     if (n>=1 && n<=30){
		    	 System.out.println("");
				 System.out.println("FOR LOOP:"); //start with the for loop
		    	 //the loop of all the separate numbers
		    	 for (int number=1;number<=n;number++){ 
		    	 //when the number is an odd
		    	 if(number % 2 == 1){
		        	//the loop for the height of each number
		        	for(int count = number; count>0; count--){
		        		//the loop for the length of each line of a specific number
		        		for (int length = count-1; length > 0; length--){
		        			System.out.print(number);
		        		}
		        		System.out.println(number);
		        	}
		        }
		        //when the number is an even
		        else if (number % 2 == 0){
		        	//the loop for the height of each number
		        	for(int count = 0; count<number; count++){
		        		//the loop for the length of each line of a specific number
		        		for (int length = 0; length<count; length++){
		        			System.out.print(number);
		        		}
		        		System.out.println(number);
		        	}
		        }          
		     }
		    	 System.out.println("");
				 System.out.println("WHILE LOOP:"); //then do a while loop
				 int number = 1; //initialize the variable
				 //the loop of all the separate numbers
				 while(number<=n){
					 //when the number is an odd
					 if(number % 2 == 1){
				        	int count = number; 
				            //the loop for the height of each number
				        	while(count>0){
				        		int length = count-1;
				        		//the loop for the length of each line of a specific number
				        		while(length>0){
				        		     length--;
				        		     System.out.print(number);
				        		}
				        		count--;
				        	    System.out.println(number);
				        	}
				        		
				        	}
				    //when the number is an even
				    else if(number % 2 == 0){
			        	int count = 0; 
			        	//the loop for the height of each number
			        	while(count<number){
			        		int length = 0;
			        		//the loop for the length of each line of a specific number
			        		while (length < count){
			        		length++;
			        		System.out.print(number);
			        		}        	
			        		count++;
			        	    System.out.println(number);
			        	}		
			        }          
				      number++;
				 }
				 
				 System.out.println("");
				 System.out.println("DO-WHILE LOOP:"); //finally, do the do-while loop
				 int numberone = 1;
				 do{
					 //when the number is an odd
					 if(numberone % 2 == 1){
				        	int count = numberone; 
				        	do{
				        		int length = count-1;
				        		do{
				        			length--;
				        			System.out.print(numberone);
				        		}while(length>0);//the loop for the length of each line of a specific number
				        		count--;
				        		if (count!=0) {
				        	    System.out.println(numberone);
				        		}
				        		else {
				        			System.out.println("");	
				        		}
				        	}while(count>0);//the loop for the height of each number	
				        	}
				    //when the number is an even
				    else if(numberone % 2 == 0){
			        	int count = 0;
			        	do{
			        		int length = 0;
			        		do{
			        		length++;
			        		System.out.print(numberone);
			        		}while (length < count);//the loop for the length of each line of a specific number
			        		if (count!=0) {
				        	    System.out.println(numberone);
				        		}
				        		else {
				        			System.out.println("");	
				        		}
			        		count++;
			        	}while(count<numberone);//the loop for the height of each number	
			        }          
				      numberone++;
				 }while(numberone<=n);//the loop of all the separate numbers
		     }
		     else{
		    	 System.out.println("The number is out of range [1,30]."); //what if the number is not belong to the range 1 to 30
		     }
      }  
	  else{
	     System.out.println("The number is not an integer."); //what if the number is not an integer
	  }
	  

 
  
  }//end of method
 }//end of class
