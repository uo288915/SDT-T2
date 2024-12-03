package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[40][40];

        Random r = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = r.nextInt(100);
                if (isPrime(num)) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = num;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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
}
