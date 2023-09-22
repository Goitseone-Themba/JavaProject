package JavaLab1;
//Goitseone Themba 21000539
import java.util.Scanner;

public class matrixOperations {
    public static void main(String[] args) {
        Scanner snatch = new Scanner(System.in);

        int rows1, columns1, rows2, columns2;

        // Take the number of rows and columns for the first matrix
        System.out.println("Enter number of rows for the first matrix");
        rows1 = snatch.nextInt();
        System.out.println("Enter number of columns for the first matrix");
        columns1 = snatch.nextInt();

        // Take the number of rows and columns for the second matrix
        System.out.println("Enter number of rows for the second matrix");
        rows2 = snatch.nextInt();
        System.out.println("Enter number of columns for the second matrix");
        columns2 = snatch.nextInt();

        // Check if multiplication is possible
        if (columns1 != rows2) {
            System.out.println("multiplication not possible");
            return; // Exit the program
        }

        // Create matrices
        int[][] first = new int[rows1][columns1];
        int[][] second = new int[rows2][columns2];
        int[][] answer = new int[rows1][columns2];

        // Initialize the first matrix with input from the user
        System.out.println("Enter details for the first matrix");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.println("Enter value for " + (i + 1) + "," + (j + 1));
                first[i][j] = snatch.nextInt();
            }
        }

        // Initialize the second matrix with input from the user
        System.out.println("Enter details for the second matrix");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.println("Enter value for " + (i + 1) + "," + (j + 1));
                second[i][j] = snatch.nextInt();
            }
        }

        // Multiply the matrices and initialize the answer matrix
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    answer[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        // Print the answer matrix
        System.out.println("The resultant matrix is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
