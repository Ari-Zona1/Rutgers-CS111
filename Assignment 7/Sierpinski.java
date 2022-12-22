/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Arjan Abazovic aa2386
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        int sides = 3;
        double heightT = (Math.sqrt(sides))*length/2; //calculate the root and then use the equation for h
        return heightT;
	// WRITE YOUR CODE HERE
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
        double x2, x3, y2;
        x2 = x+length/2;
        //System.out.println(x2);
        x3 = x-length/2;
        //System.out.println(x3);
        y2 = y+height(length);
        //System.out.println(y2);
        double[] xArr = {x,x2,x3}; //Create our new arrays to fill in
        double[] yArr = {y,y2,y2}; //Create our new arrays to fill in
        StdDraw.filledPolygon(xArr,yArr);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
        //base case -> end is reached
        if(n==1){
            filledTriangle(x,y,length); //Fill in the trianlge
        }
        
        else{
            filledTriangle(x,y,length); //Fill in the triangle
            double x2 = x-(length/2); //Create new x
            //System.out.println(x2);
            
            double newLenght = length/2;
            //System.out.println(newLenght);

            sierpinski(n-1, x2, y, newLenght); //New Triangles
            
            double y2 = y+height(length); //New y using the height functions
            //System.out.println(y2);
            sierpinski(n-1, x, y2, newLenght);
            
            double x3 = x+(length)/2; //New x axis
            //System.out.println(x3);
            sierpinski(n-1, x3, y, newLenght);
        }
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
        //Grab our arg input by the user
        int n = Integer.parseInt(args[0]);
        //System.out.println(n);
        //Create our array
        double[] xArry = {0,1,0.5};
        double len = xArry[1]-xArry[0];
        //System.out.println(len);
        //System.out.println(height(len));

        //Need to create our new array for the y axis but need to use the new height
        double[] yArry = {0,0,height(len)};

        //Use draw
        StdDraw.polygon(xArry,yArry);
        //Call the recursive function to draw all the triangles
        sierpinski(n, xArry[2], yArry[1], 0.5);
    }
}
