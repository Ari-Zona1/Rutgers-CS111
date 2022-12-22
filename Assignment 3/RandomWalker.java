/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Arjan Abazovic
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        //Set starting position
        int x = 0;
        int y = 0;

        //Print first origin
        System.out.println("(" + x + "," + y + ")");

        //Loops through the number of random moves
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            int randomMove = (int)(Math.random() * 4) + 1;
            
            //Maps each number to a corresponding move
            switch (randomMove) {
                case 1: //Moves north -> x+1
                    x++;
                    break;
            
                case 2: //Moves south -> x-1
                    x--;
                    break;
                
                case 3: //Moves east -> y+1
                    y++;
                    break;
            
                case 4: //Moves west -> y-1
                    y--;
                    break;
            }

            //Display current position
            System.out.println("(" + x + "," + y + ")");
        }

        //Sqaured distance -> Sqaure and add the numbers 
        double total = (double)(x*x)+(y*y);
        
        //Displays
        System.out.println("Squared distance = " + total); 
    }
}
