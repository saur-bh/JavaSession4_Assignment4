/*
 * Write a program to find the aliquot sum of a given number.
Hint: The aliquot divisors of a number are all its divisors except the number itself. The aliquot
sum is the sum of the aliquot divisors.
For example, the aliquot divisors of 12 are 1, 2, 3, 4, and6 and its aliquot sum is 16. Extend this
program to check if given number is a perfect number or not. If a number equals to its aliquot
sum, then it is a perfect number. Print all perfect numbers between 1 to 100.
 */

package com.acadglid.session;

public class Assignment4 {

	public static void main(String[] arg) {

		//1.Start the outer  loop to from 1 to 100 

		for( int numberToCheck = 1; numberToCheck < 100 ; numberToCheck++ ) {

			//2. Initialize the sum to zero 
			int sum = 0;

			//3. Start the loop till the numberToCheck;

			for(int i=numberToCheck; i>0 ;i--) {


				// Check the numberToCheck on condition 

				if((numberToCheck%i==0) && (i!=numberToCheck)){

					//System.out.println("This is what I need-->" +i);

					sum= sum + i ;

				}

			}

			//4.Check for the sum equal to numberToCheck and print the output.

			if(sum==numberToCheck) {

				System.out.println("The perfect number is -->"+numberToCheck+" its aliquot sum is-->"+sum);
				System.out.println("----------------------------------------------------");

			}
		}
	}

}




