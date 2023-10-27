//Author = Goitseone Themba 21000539
import java.util.Scanner;

public class Gaussian_Elimination_21000539 {
    public static void main(String[] args) {
        // Create a scanner called snatch to take input from the user
        Scanner snatch = new Scanner(System.in);

        // Prompt the user to enter the size of the system of linear equations
        System.out.println("-- Gaussian Elimination Solver in Java --");
        System.out.print("How many equations would you like to solve? ");
        int size = snatch.nextInt();

        // Check if the size is greater than 10
        if (size > 10) {
            System.out.print("You are trying to solve more than 10 equations. Are you sure? (yes/no): ");
            String confirmation = snatch.next();
            if (!confirmation.equalsIgnoreCase("yes")) {
                System.out.println("Aborting. You can re-run the program to solve up to 10 equations.");
                snatch.close();
                return;
            }
        }

        // Create an augmented matrix of the user's specified size
        double[][] augmentedMatrix = new double[size][size + 1];

        // Initialize the augmented matrix
        System.out.println("Enter the coefficients of the equations and right-hand side values:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size; j++) {
                augmentedMatrix[i][j] = snatch.nextDouble();
            }
        }

        // Forward elimination (also known as row reduction, elimination phase, or Gauss elimination)
        for (int k = 0; k < size; k++) {
            for (int i = k + 1; i < size; i++) {
                double factor = augmentedMatrix[i][k] / augmentedMatrix[k][k];
                for (int j = k; j <= size; j++) {
                    augmentedMatrix[i][j] -= factor * augmentedMatrix[k][j];
                }
            }
        }

        // Backward elimination (also known as back substitution, reverse elimination, or backward phase)
        double[] answer = new double[size];
        for (int i = size - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < size; j++) {
                sum += augmentedMatrix[i][j] * answer[j];
            }
            answer[i] = (augmentedMatrix[i][size] - sum) / augmentedMatrix[i][i];
        }

        // Print out the answer with variable names
        System.out.println("Solution:");
        char variable = 'x';
        for (int i = 0; i < size; i++) {
            System.out.println(variable + " = " + answer[i]);
            variable++;
        }

        snatch.close();
    }
}
