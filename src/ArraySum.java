import java.util.Random;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int N = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int M = scanner.nextInt();

        int[][] array = new int[N][M];
        int[][] neighborsSum = new int[N][M];

        RandomNumbers(array, 1, 9);
        System.out.println("Исходный массив:");
        printArray(array);

        SumNeighbors(array, neighborsSum);
        System.out.println("Массив с суммами:");
        printArray(neighborsSum);

        scanner.close();
    }

    public static void RandomNumbers(int[][] array, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    public static void SumNeighbors(int[][] array, int[][] sumArray) {
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                if (i > 0) {
                    sum += array[i - 1][j];
                }
                if (i < rows - 1) {
                    sum += array[i + 1][j];
                }
                if (j > 0) {
                    sum += array[i][j - 1];
                }
                if (j < cols - 1) {
                    sum += array[i][j + 1];
                }
                sumArray[i][j] = sum;
            }
        }
    }
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}