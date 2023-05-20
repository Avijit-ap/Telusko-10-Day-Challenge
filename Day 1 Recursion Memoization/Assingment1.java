//Problem Statement:  Write a code of Pascal Triangle with Memoization and Recursion and iteration , three different codes.

import java.util.Arrays;
import java.util.Scanner;

public class Assingment1 {
    private static int[][] memo;

    public static void main(String[] args) {
        int rows = 5; // Number of rows in Pascal's triangle to generate
        System.out.println("Recursive approach:");
        printPascalTriangleRecursive(rows);
        System.out.println("\nMemoization approach:");
        printPascalTriangleMemoization(rows);
        System.out.println("\nIterative approach:");
        printPascalTriangleIterative(rows);
    }

    // Recursive approach
    public static void printPascalTriangleRecursive(int rows) {
        for (int i = 0; i < rows; i++) {
            printSpaces((rows - i - 1) * 2); // Print initial spaces for alignment
            for (int j = 0; j <= i; j++) {
                int result = calculatePascalNumberRecursive(i, j); // Calculate Pascal number
                System.out.print(result + "   "); // Print Pascal number with spacing
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    public static int calculatePascalNumberRecursive(int row, int col) {
        if (col == 0 || col == row) {
            return 1; // Base case: First and last column are always 1
        } else {
            int left = calculatePascalNumberRecursive(row - 1, col - 1); // Calculate left Pascal number
            int right = calculatePascalNumberRecursive(row - 1, col); // Calculate right Pascal number
            return left + right; // Sum of left and right Pascal numbers
        }
    }

    // Memoization approach
    public static void printPascalTriangleMemoization(int rows) {
        memo = new int[rows][rows]; // Initialize memoization array
        for (int[] row : memo) {
            Arrays.fill(row, -1); // Set all values to -1 (not calculated yet)
        }
        for (int i = 0; i < rows; i++) {
            printSpaces((rows - i - 1) * 2); // Print initial spaces for alignment
            for (int j = 0; j <= i; j++) {
                int result = calculatePascalNumberMemoization(i, j); // Calculate Pascal number
                System.out.print(result + "   "); // Print Pascal number with spacing
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    public static int calculatePascalNumberMemoization(int row, int col) {
        if (col == 0 || col == row) {
            return 1; // Base case: First and last column are always 1
        }
        if (memo[row][col] != -1) {
            return memo[row][col]; // If already calculated, return the stored value
        }
        int left = calculatePascalNumberMemoization(row - 1, col - 1); // Calculate left Pascal number
        int right = calculatePascalNumberMemoization(row - 1, col); // Calculate right Pascal number
        int result = left + right; // Sum of left and right Pascal numbers
        memo[row][col] = result; // Store the calculated value in the memoization array
        return result;
    }

    // Iterative approach
    public static void printPascalTriangleIterative(int rows) {
        int[][] triangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1]; // Initialize the array for each row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1; // First and last column are always 1
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // Calculate Pascal number
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            printSpaces((rows - i - 1) * 2); // Print initial spaces for alignment
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + "   "); // Print Pascal number with spacing
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" "); // Print spaces
        }
    }
}
