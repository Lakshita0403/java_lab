import java.util.Scanner;

public class array {
  public static void main(String args[]) {
    /*
     * Scanner sc = new Scanner(System.in);
     * int total = 0;
     * int marks[] = new int[5];
     * 
     * System.out.println("Enter values of marks: ");
     * for (int i = 0; i < marks.length; i++) {
     * marks[i] = sc.nextInt();
     * total = total + marks[i];
     * }
     * 
     * System.out.println("Total marks is: " +total);
     * int avg = (total)/marks.length;
     * System.out.println("Average of marks is: " +avg);
     */



    /*
     * int i, j, row, col;
     * System.out.println("Enter size of 1st array : ");
     * Scanner s = new Scanner(System.in);
     * row = s.nextInt();
     * col = s.nextInt();
     * int[][] one = new int[row][col];
     * 
     * System.out.println("Elements of 1st matrix: ");
     * for (i = 0; i < row; i++) {
     * for (j = 0; j < col; j++) {
     * one[i][j] = s.nextInt();
     * System.out.printf(" ");
     * }
     * 
     * }
     * 
     * System.out.println("Enter size of 2nd array : ");
     * Scanner p = new Scanner(System.in);
     * row = p.nextInt();
     * col = p.nextInt();
     * int[][] sec = new int[row][col];
     * 
     * System.out.println("Elements of 2nd matrix: ");
     * for (i = 0; i < row; i++) {
     * for (j = 0; j < col; j++) {
     * sec[i][j] = p.nextInt();
     * System.out.printf(" ");
     * }
     * }
     * 
     * int[][] res = new int[row][col];
     * for (i = 0; i < row; i++) {
     * for (j = 0; j < col; j++) {
     * res[i][j] = one[i][j] + sec[i][j];
     * }
     * // System.out.println();
     * }
     * System.out.println();
     * System.out.println("The addition of two matrices is : ");
     * for (i = 0; i < row; i++) {
     * for (j = 0; j < col; j++) {
     * System.out.print(res[i][j] +" ");
     * }
     * System.out.println();
     * }
     */

    int[][] mat1 = { { 1, 2, 3 },
        { 4, 5, 6 },{2,3,4} };
    int[][] mat2 = { { 2, 6, 13 },
        { 3, 7, 1 } ,{1,2,3}};
    int[][] result = { { 0, 0, 0 },
        { 0, 0, 0 },{0,0,0} };
    for (int i = 0; i < mat1.length; i++) {
      for (int j = 0; j < mat1[i].length; j++) {
      //  System.out.format("Setting value for i=%d and j=%d\n", i, j);
        result[i][j] = mat1[i][j] * mat2[i][j];
      }
    }

    // printing the elements of 2-d array
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j <3; j++) {
        System.out.print(result[i][j] + "  ");
       // result[i][j] = mat1[i][j] * mat2[i][j];
      }
      System.out.println(" "); // printing a new line
    }

  }
}