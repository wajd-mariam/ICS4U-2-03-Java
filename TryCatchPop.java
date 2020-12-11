/*
* Copyright (c) 2020
*
* The Stack file adds integer added by the 
* user to the stack array and it pops it off the stack. It also checks
* whether the stack is empty or not and doesn't crash.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/10
*/

// Imports Java Classes:
import java.util.Scanner;


class TryCatchPop {
  public static void main(String[] args) {

    // Declaring the stackArray using WajdStack Class
    WajdStack2 stackArray = new WajdStack2();

    // Entering a while true loop:
    while (true) {
      
      // Declaring variables used:
      int sizeStack = 0;
      int intAdded = 0;
      int counter = 0;
      int counter2 = 0;
      int popNumber = 0;
  
      // Try Catch Statement for catching input error:
      try {
      
        // Input / Process / Output
      
        // Getting size of the stack:
        Scanner input1 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter the size of the stack: ");
        sizeStack = input1.nextInt();
      
        // Checking if entered size is valid:
        if (sizeStack == 0) {
          System.out.println("You can't have a stack size 0!");
          break;
        } else { 
          // Entering a do/while loop add integers into the stack list:
          do {
            // Getting an integer from the user:
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter a number to add to the stack: ");
            intAdded = input2.nextInt();
            // Adding one to counter each time:
            counter = counter + 1;
            // Pushing the integer inputted  to the stack:
            stackArray.push(intAdded);
          } while (counter != sizeStack); 
          
          // Asking user how many times they would like to pop numbers off stack:
          Scanner input3 = new Scanner(System.in);
          System.out.print("How many times do you want to pop integers off stack?  ");
          popNumber = input3.nextInt(); 
          // Try Catch Statement for catching if stack is empty:
          try {
            // Entering a do/while loop to pop off numbers from stack:
            do {
              // Popping off the first element in the stack and printing to user:
              System.out.println("");
              System.out.println("The popped number is " + stackArray.pop());
              // Printing array list stack the user created:
              System.out.println("");
              System.out.println("The stack after popping off the current top integer: ");
              System.out.println(stackArray.list());
              // Adding one to counter2 each time:
              counter2 = counter2 + 1;
            } while (counter2 != popNumber);
          // Error catch null value passed:
          } catch (NullPointerException e) {
            System.out.println("");
            System.out.print("ERROR. Stack is empty!");
          }
        }  
      // Error Catch Statement:
      } catch (Exception e) {
        System.out.print("");
        System.out.println("ERROR."); 
      }
    }
  }
}