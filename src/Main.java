package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        Random r = new Random();
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = r.nextInt(100);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
