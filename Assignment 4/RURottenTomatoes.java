/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		//Rows and column vars
		int rows = Integer.parseInt(args[0]);
		int columns= Integer.parseInt(args[1]);
		
		//keep track of total sum for each column
		int[] totalSum = new int[columns];

		//Create a two array to create the movie template
		int[][] dArr = new int[rows][columns];
		int index = 2; //Keeps track of index -> skips two first input
		
		//places the inputs into the 2d array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				dArr[i][j] = Integer.parseInt(args[index]);
				index++;
			}
		}
		
		//calculates totals for each column
		for (int i = 0; i < columns; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum += dArr[j][i];
			}
			totalSum[i] = sum;
		}

		//finds the largest sum and keeps the index with the lower index when there is a tie
		int largestSum = totalSum[0];
		int largestIndex = 0;
		for (int j = 1; j < totalSum.length; j++) {
			if(largestSum < totalSum[j]){
				largestSum = totalSum[j];
				largestIndex = j;
			}
		}

		System.out.println(largestIndex);

	}
}
