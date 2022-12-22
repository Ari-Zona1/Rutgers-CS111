/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Arjan Abazovic aa2386 
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if(n==0){ //Base Case
            return original;
        }else{
            //Needs to append the og string to the new one
            return appendNTimes(original,n-1) + original;
        }
    }

    public static void main (String[] args) {

	    // Grab args from the input
        String input = args[0]; //No need to parse as args is a string
        int n = Integer.parseInt(args[1]);
        //System.out.println(n);
        String answer = appendNTimes(input, n);
        System.out.println(answer);

    }
}
