/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Arjan Abazovic
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        //Set an array to collect the intergers from the user -> Size 5
        int[] nums = new int[5]; //declare and allocate memory
        
        //Loop thru the input command 5 times
        int i = 0;
        while (i < 5) {
            nums[i] = Integer.parseInt(args[i]);
            i++; //increase counter
        }

        //Loop through the array to find largest number
        int largestNum = nums[0]; //Set largest to the first number for a starting point

        for (i = 1; i < 5; i++) { //sets i = 1 because we skip the first iteration because we set nums[0] to largestNum
            if (nums[i] > largestNum){ //If current number is higher than largest then we set new largest
                largestNum = nums[i];
            }
        }

        //Displays output
        System.out.println(largestNum);
    }
}