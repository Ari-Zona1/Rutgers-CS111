/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Arjan Abazovic
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        char[] longNumber = args[0].toCharArray(); //Converts the single string into a char array
        
        /* For Testing purpose
        for (char c : longNumber) {
            System.out.println(c);
        }
        */

        //Length can be 12 or 13
        //Starting from the right
        int rightTotal = 0;
        for (int i = longNumber.length-1; i >= 0; i-=2) {
            rightTotal += Character.getNumericValue(longNumber[i]);
        }

        //Discard Tens
        rightTotal = rightTotal%10;
  
        //Starting from the second right most
        int secondRightTotal = 0;
        for (int i = longNumber.length-2; i >= 0; i-=2) {
            secondRightTotal += Character.getNumericValue(longNumber[i]);
        }

        //Discard Tens
        secondRightTotal = secondRightTotal%10;

        //Multiply by 3
        secondRightTotal *= 3;

        //Discard Tens
        secondRightTotal = secondRightTotal%10;

        int total = rightTotal+secondRightTotal;

        //Discard Tens
        total = total %10;

        //Display total
        System.out.println(total);
    }
}