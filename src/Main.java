package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Advanced SDT Program\n");

        int[][] matrix = new int[40][40];
        Random randomGenerator = new Random();

        initializeMatrix(matrix, randomGenerator);

        System.out.println("Initial Matrix:");
        printMatrix(matrix);

        selectionSortMatrix(matrix);

        System.out.println("\nSorted Matrix:");
        printMatrix(matrix);
    }

    public static void initializeMatrix(int[][] matrix, Random randomGenerator) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int num = randomGenerator.nextInt(100) + 1; // Números entre 1 y 100
                matrix[row][col] = (isPrime(num) && num > 50) ? 0 : num; // Modifiqué la condición
            }
        }
    }

    public static void selectionSortMatrix(int[][] matrix) {
        int totalElements = matrix.length * matrix[0].length;

        for (int i = 0; i < totalElements - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < totalElements; j++) {
                if (getElement(matrix, j) < getElement(matrix, minIndex)) {
                    minIndex = j;
                }
            }
            swapElements(matrix, i, minIndex);
        }
    }

    public static int getElement(int[][] matrix, int index) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        return matrix[index / cols][index % cols];
    }

    public static void swapElements(int[][] matrix, int index1, int index2) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int temp = matrix[index1 / cols][index1 % cols];
        matrix[index1 / cols][index1 % cols] = matrix[index2 / cols][index2 % cols];
        matrix[index2 / cols][index2 % cols] = temp;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

