package src;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a program for the SDT subject\n");

        int[][] matrix = new int[30][30];
        Random r = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = r.nextInt(50);
                if (isPrime(num) && num > 20) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = num;
                }
            }
        }

        System.out.println("Matrix before sort:");
        printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] < matrix[k][l]) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("\nMatrix after sort:");
        printMatrix(matrix);
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

