# Assignment 5

This repository contains a Java program called `PolygonTransform.java` that performs various geometric transforms on polygons. The program includes several utility programs: `StdDraw.java`, `StdIn.java`, `StdOut.java`, and `StdRandom.java`.

A polygon is defined by its sequence of vertices (x0, y0), (x1, y1), (x2, y2), …. In the program, a polygon is represented by storing the x- and y-coordinates of the vertices in two parallel arrays `x[]` and `y[]`.

![alt text](https://introcs.cs.rutgers.edu/wp-content/uploads/sites/55/2019/10/polygon-1.png)

Three useful geometric transforms are scale, translate, and rotate. The `PolygonTransform` class includes the following methods to perform these transformations:

- `public static double[] copy(double[] array)`: returns a new array object that is an exact copy of the given array. The given array is not mutated.
- `public static void scale(double[] x, double[] y, double alpha)`: scales the polygon by the factor `alpha`.
- `public static void translate(double[] x, double[] y, double dx, double dy)`: translates the polygon by (`dx`, `dy`).
- `public static void rotate(double[] x, double[] y, double theta)`: rotates the polygon `theta` degrees counterclockwise, about the origin.

To run the program, you will need to have the Java Development Kit (JDK) installed on your machine. Then, follow these steps:

1. Open a terminal window
2. Navigate to the directory where the Java files are located
3. Compile the `PolygonTransform.java` file using the `javac` command: `javac PolygonTransform.java`
4. Run the program using the `java` command: `java PolygonTransform`

Note that the transformation methods `scale()`, `translate()`, and `rotate()` mutate the polygons. Here are some example test cases:

// Scales polygon by the factor 2.
StdDraw.setScale(-5.0, +5.0);
double[] x = { 0, 1, 1, 0 };
double[] y = { 0, 0, 2, 1 };
double alpha = 2.0;
StdDraw.setPenColor(StdDraw.RED);
StdDraw.polygon(x, y);
scale(x, y, alpha);
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);


![alt text](https://introcs.cs.rutgers.edu/wp-content/uploads/sites/55/2019/10/scale.png)

// Translates polygon by (2, 1).
StdDraw.setScale(-5.0, +5.0); 
double[] x = { 0, 1, 1, 0 }; 
double[] y = { 0, 0, 2, 1 }; 
double dx = 2.0, dy = 1.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x, y); 
translate(x, y, dx, dy); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);

![alt text](https://introcs.cs.rutgers.edu/wp-content/uploads/sites/55/2019/10/translate.png)

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


![alt text](https://introcs.cs.rutgers.edu/wp-content/uploads/sites/55/2019/10/rotate.png)
