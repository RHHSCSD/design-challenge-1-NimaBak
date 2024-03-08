/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program: 
*  Author: Nima Bakhshaie
*  Date: 03 - 07 - 2024
*  Description:
****************************************************/

/**************** IPO CHART ************************
*INPUT:
* Amount of students doing Arduino
* Amount of students doing Raspberry Pi
* Amount of students doing VR Project
*PROCESSING:
* Multiply the students doing Arduino by the cost of each kit (base cost + extra), accounting for discounts
* Multiply the students doing Raspberry Pi by the cost of each kit (base cost + extra), accounting for discounts
* Multiply the students doing VR Project by the cost of each kit (base cost + extra), accounting for discounts
* Calculate additional discount for over 100 students
* Add the costs together then divide by the amount of students
*OUTPUT:
* Price per student
*
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Ouput
*Input: 1, 1, 1      Output: $65.0
*Input: 30, 10, 15   Output: $63.09
*Input: 50, 50, 50   Output: $61.17
*Input: 10, 30, 15   Output: $63.82
*Input: 10, 10, 90   Output: $66.14
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code

   Scanner keyboard = new Scanner(System.in);
   
   //Define const prices
   final int UNIT_COST_ARDUINO = 60;
   final int UNIT_COST_ARDUINO_DISCOUNT = 59;
   final int UNIT_COST_PI = 65;
   final int UNIT_COST_PI_DISCOUNT = 62;
   final int UNIT_COST_VR = 70;
   final double BASE_KIT_DISCOUNT = 2.5;
   
   //Initiate cost variables
   int piCost;
   int arduinoCost;
   
   //Ask user for amount of students with arduino kit
   System.out.print("How many students bought an Arduino kit: ");
   int numArduino = keyboard.nextInt();
   
   //Ask user for amount of students with raspberry pi
   System.out.print("How many students bought a Raspberry Pi kit: ");
   int numPi = keyboard.nextInt();
   
   //Ask user for amount of students with vr kit
   System.out.print("How many students bought an VR kit: ");
   int numVR = keyboard.nextInt();
   
   //Store the total amount of students in a var
   int totalStudents = numArduino + numPi + numVR;
   
   //Check if the students with arduino are eligible for discount and calculate their cost
   if (numArduino > 15) {
       arduinoCost = numArduino * UNIT_COST_ARDUINO_DISCOUNT;
   }
   else {
       arduinoCost = numArduino * UNIT_COST_ARDUINO;
   }
   
   //Check if the students with raspberry pi are eligible for discount and calculate their cost
  if (numPi > 20) {
      piCost = numPi * UNIT_COST_PI_DISCOUNT;
  }
  else {
      piCost = numPi * UNIT_COST_PI;
  }
    
   //Calculate the cost of the students with the VR kit
   int costVR = numVR * UNIT_COST_VR;
   
   //Add the costs together and divide by total number of students
   double costPerStudent = ((double)(arduinoCost + piCost + costVR)) / totalStudents;
   
   //Check if cost is eligible for 5% discount
   if (totalStudents > 100) {
       costPerStudent -= BASE_KIT_DISCOUNT;
   }
   
   //Print final price per student
    System.out.println("The final price per student is $" + (Math.round(costPerStudent * 100)/100.0));
    }
    
}
