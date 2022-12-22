/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Arjan Abazovic
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

        //Stores all the numbers into a int var by converting a string into a int
        int w = Integer.parseInt(args[0]); //First number
        int x = Integer.parseInt(args[1]); //Second number
        int y = Integer.parseInt(args[2]); //Third number
        int z = Integer.parseInt(args[3]); //Forth number
        

        //Create a boolean orderChecker - value is true if the four values are either in strictly ascending order (w < x < y < z) or strictly descending order (w > x > y > z), and false otherwise
        boolean orderChecker = (w > x && x > y && y > z) || (w < x && x < y && y < z);
        System.out.println(orderChecker);
	
    }
}
