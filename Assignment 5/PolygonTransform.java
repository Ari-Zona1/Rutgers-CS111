/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        //Create new array
        double [] newarray = new double [array.length];
        
        //loop thru the array and place values in from array
        for (int i = 0; i < newarray.length; i++) {
            newarray[i] = array[i];
        }
        return newarray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        //loop through the array and muplite each array value by alpha
        for (int i = 0; i < y.length; i++) {
            x[i] *= alpha;
            y[i] *= alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        //loop through the array and add each array value by their respective offset
        for (int i = 0; i < y.length; i++) {
            x[i] += dx;
            y[i] += dy;
        }

	
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        //loop through the array and substract each array value by x‘i = xi cos θ – yi sin θ 
        double[] xCopy = copy(x); //Need to make a copy so the values can change.
        for (int i = 0; i < y.length; i++) {
            x[i] = (x[i] * Math.cos(Math.toRadians(theta))) - (y[i] * Math.sin(Math.toRadians(theta)) );
            y[i] = (y[i] * Math.cos(Math.toRadians(theta))) + (xCopy[i] * Math.sin(Math.toRadians(theta)) );
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	    // Scales polygon by the factor 2.
        /*StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double alpha = 2.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        scale(x, y, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        */


        // Translates polygon by (2, 1).
        /*StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double dx = 2.0, dy = 1.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        translate(x, y, dx, dy); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        */

        // Rotates polygon 45 degrees. 
        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double theta = 45.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        rotate(x, y, theta); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}
