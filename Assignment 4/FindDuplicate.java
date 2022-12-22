/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		//Create an array of args length
		int[] arr = new int [args.length];

		//Place the inputs into a int array
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		//check for a duplicate
		//loop ends when a dup is found

		//Checks for dups
		boolean dups = false;

		//loops through the array to find dup and do comparsions
		for (int i = 0; i < arr.length; i++) {
			if(dups == true){
				break;
			}
			for (int j = 0; j < arr.length; j++) {
				if (dups == true) {
					break;
				}else{
					if(arr[i] == arr[j] && j != i){
						dups = true;
					}
				}
			}
		}
		System.out.print(dups);
	}
}
