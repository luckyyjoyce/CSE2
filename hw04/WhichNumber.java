///////////////////////////
//Ruoting Li
//Feb 13rd, 2015
//CSE002
//WhichNumber Java Program
//
//  first compile the program
//      javac WhichNumber.java
//  run the program
//      java WhichNumber//

//first import
  import java.util.Scanner;
  
//define a class
  public class WhichNumber{

//add main method
  public static void main(String[ ] args) {
   
//input
  System.out.println("Think of a number between 1 and 10 incusive."); //think about a integer between 1 to 10
  Scanner input = new Scanner(System.in);
  System.out.print("Is the number even? "); //ask yourself whether it is a even number or not
  String s1 = input. nextLine();
  char ch1 = s1.charAt(0); //new char input
  
  if (ch1 == 'y' || ch1 == 'Y'){
     System.out.print("Is it divisible by 3? "); //ask yourself whether it can be divided by 3
     String s2 = input.nextLine();
     char ch2 = s2.charAt(0); //new char input
     if (ch2 == 'y' || ch2 == 'Y'){
    	 System.out.print("Is your number 6?"); //the number is 6
      String s10 = input.nextLine();
      char ch10 = s10.charAt(0); //new char input
      if (ch10 == 'y' || ch10 == 'Y'){
         System.out.println("Yay!");
      }
      else if (ch10 == 'n' || ch10 == 'N'){
         System.out.println("You are lying.");
      }
      else{
         System.out.println("Sorry that is not a valid input.");
      }
     }
     else if (ch2 == 'n' || ch2 == 'N'){
    	 System.out.print("Is the number divisible by 4? "); //ask yourself whether it can be divided by 4
    	 String s3 = input.nextLine();
         char ch3 = s3.charAt(0); //new char input
         if (ch3 == 'y' || ch3 == 'Y'){
        	 System.out.print("Is the number divided by 4 geater than 1? "); //ask yourself whether it has a remainder greater than 1 when divided by 4
        	 String s4 = input.nextLine();
             char ch4 = s4.charAt(0); //new char input
             if (ch4 == 'y' || ch4 == 'Y'){
            	 System.out.print("Is your number 8?"); //the number is 8
              String s11 = input.nextLine();
              char ch11 = s11.charAt(0); //new char input
               if (ch11 == 'y' || ch11 == 'Y'){
                   System.out.println("Yay!");
                }
                else if (ch11 == 'n' || ch11 == 'N'){
                   System.out.println("You are lying.");
                }
                else{
                   System.out.println("Sorry that is not a valid input.");
                }
             }
             else if (ch4 == 'n' || ch4 == 'N'){
            	 System.out.print("Is your number 4?"); //the number is 4
              String s12 = input.nextLine();
              char ch12 = s12.charAt(0); //new char input
                 if (ch12 == 'y' || ch12 == 'Y'){
                     System.out.println("Yay!");
                 }
                 else if (ch12 == 'n' || ch12 == 'N'){
                   System.out.println("You are lying.");
                 }
                 else{
                   System.out.println("Sorry that is not a valid input.");
                 }
             }
             else{
            	 System.out.println("Sorry, that is not a valid input"); //the wrong input
             }
         }
         else if (ch3 == 'n' || ch3 == 'N'){
        	 System.out.print("Is it divisible by 5? "); //ask yourself whether it can be divided by 5
        	 String s5 = input.nextLine();
             char ch5 = s5.charAt(0); //new char input
             if (ch5 == 'y' || ch5 == 'Y'){
            	 System.out.print("Is your number 10?"); //the number is 10
              String s13 = input.nextLine();
             char ch13 = s13.charAt(0); //new char input
                if (ch13 == 'y' || ch13 == 'Y'){
                  System.out.println("Yay!");
                }
                else if (ch13 == 'n' || ch13 == 'N'){
                   System.out.println("You are lying.");
                }
                else{
                   System.out.println("Sorry that is not a valid input.");
                }
             }
             else if (ch5 == 'n' || ch5 == 'N'){
            	 System.out.print("Is your number 2?"); //the number is 2
              String s14 = input.nextLine();
              char ch14 = s14.charAt(0); //new char input
                   if (ch14 == 'y' || ch14 == 'Y'){
                      System.out.println("Yay!");
                   }
                   else if (ch14 == 'n' || ch14 == 'N'){
                   System.out.println("You are lying.");
                   }
                   else{
                   System.out.println("Sorry that is not a valid input.");
                   }
             }
             else{
            	 System.out.println("Sorry, that is not a valid input"); //wrong input
             }
         }
         else{
        	 System.out.println("Sorry,that is not a valid input"); //wrong input
         }
     }
     else{
    	 System.out.println("Sorry, that is not a valid input."); //wrong input
     }
  }
  else if (ch1 == 'n' || ch1 == 'N'){
     System.out.print("Is it divisible by 3? "); //ask yourself whether it can be divided by 3
     String s6 = input.nextLine();
     char ch6 = s6.charAt(0); //new char input
     if (ch6 == 'y' || ch6 == 'Y'){
    	 System.out.print("When divided by 3 is the result greater than 1? "); //ask yourself whether it has a remainder greater than 1 when divided by 3
    	 String s7 = input.nextLine();
         char ch7 = s7.charAt(0); //new char input
         if (ch7 == 'y' || ch7 == 'Y'){
        	 System.out.print("Is your number 9?"); //the number is 9
          String s15 = input.nextLine();
          char ch15 = s15.charAt(0); //new char input
              if (ch15 == 'y' || ch15 == 'Y'){
                 System.out.println("Yay!");
              }
              else if (ch15 == 'n' || ch15 == 'N'){
                   System.out.println("You are lying.");
                }
              else{
                   System.out.println("Sorry that is not a valid input.");
              }
         }
         else if (ch7 == 'n' || ch7 == 'N'){
        	 System.out.print("Is your number 3?"); //the number is 3
         String s16 = input.nextLine();
         char ch16 = s16.charAt(0); //new char input
           if (ch16 == 'y' || ch16 == 'Y'){
               System.out.println("Yay!");
           }
           else if (ch16 == 'n' || ch16 == 'N'){
               System.out.println("You are lying.");
           }
           else{
               System.out.println("Sorry that is not a valid input.");
           }
         }
         else{
        	 System.out.println("Sorry, that is not a valid input."); //wrong input
         }
     }
     else if (ch6 == 'n' || ch6 == 'N'){
    	 System.out.print("Is it greater than 6? "); //ask yourself whether it is greater than 6
    	 String s8 = input.nextLine();
         char ch8 = s8.charAt(0); //new char input
         if (ch8 == 'y' || ch8 == 'Y'){
        	 System.out.print("Is your number 7?"); //the number is 7
          String s17 = input.nextLine();
          char ch17 = s17.charAt(0); //new char input
              if (ch17 == 'y' || ch17 == 'Y'){
                 System.out.println("Yay!");
              }
              else if (ch17 == 'n' || ch17 == 'N'){
                  System.out.println("You are lying.");
              }
              else{
                   System.out.println("Sorry that is not a valid input.");
              }
         }
         else if (ch8 == 'n' || ch8 == 'N'){
        	 System.out.print("Is it less than 3? "); //ask yourself whether it is less than 3
        	 String s9 = input.nextLine();
             char ch9 = s9.charAt(0); //new char input
             if (ch9 == 'y' || ch9 == 'Y'){
            	 System.out.print("Is your number 1?"); //the number is 1
              String s18 = input.nextLine();
              char ch18 = s18.charAt(0); //new char input
                  if (ch18 == 'y' || ch18 == 'Y'){
                     System.out.println("Yay!");
                  }
                  else if (ch18 == 'n' || ch18 == 'N'){
                   System.out.println("You are lying.");
                  }
                  else{
                   System.out.println("Sorry that is not a valid input.");
                  }
           }
             else if (ch9 == 'n' || ch9 == 'N'){
            	 System.out.print("Is your number 5?"); //the number is 5
              String s19 = input.nextLine();
              char ch19 = s19.charAt(0); //new char input
                 if (ch19 == 'y' || ch19 == 'Y'){
                    System.out.println("Yay!");
                 }
                 else if (ch19 == 'n' || ch19 == 'N'){
                   System.out.println("You are lying.");
                 }
                 else{
                   System.out.println("Sorry that is not a valid input.");
                 }
             }
             else{
            	 System.out.println("Sorry, that is not a valid input."); //wrong input
             }
         }
         else{
        	 System.out.println("Sorry, that is not a valid input"); //wrong input
         }
     }
     else{
    	 System.out.println("Sorry, that is not a valid input."); //wrong input
     }
  }
  else{
	  System.out.println("Sorry, that is not a valid input."); //wrong input
  }
  
  
  
  }   //end of main method
}  //end of class 

