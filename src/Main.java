package src;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a program that generates a random sorted matrix\n");

        int[][] matrix = new int[40][40];
        Random r = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = r.nextInt(100);
                if (isPrime(num) && num > 40) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = num;
                }
            }
        }

        System.out.println("Matrix before sort:");
        printMatrix(matrix);

        int[] flatArray = new int[matrix.length * matrix[0].length];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                flatArray[index++] = matrix[i][j];
            }
        }

        Arrays.sort(flatArray);

        index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = flatArray[index++];
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

