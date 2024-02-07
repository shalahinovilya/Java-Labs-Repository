package com.ilya;
import java.util.Random;
import java.util.Scanner;

public class LR3 {
    private static final int MAX_SIZE = 20;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розмірів матриці
        System.out.print("Введіть кількість рядків (не більше " + MAX_SIZE + "): ");
        int rows = readSize(scanner);

        System.out.print("Введіть кількість стовпців (не більше " + MAX_SIZE + "): ");
        int cols = readSize(scanner);

        // Створення матриці
        int[][] matrix = createMatrix(rows, cols, scanner);

        // Виведення матриці
        System.out.println("Матриця:");
        printMatrix(matrix);

        // Знаходження та виведення мінімуму, максимуму та середнього арифметичного
        System.out.println("Мінімальний елемент: " + findMin(matrix));
        System.out.println("Максимальний елемент: " + findMax(matrix));
        System.out.println("Середнє арифметичне: " + calculateAverage(matrix));

        // Розрахунок та виведення середнього геометричного
        System.out.println("Середнє геометричне: " + calculateGeometricAverage(matrix));
    }

    private static int readSize(Scanner scanner) {
        int size;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Будь ласка, введіть ціле число.");
                scanner.next(); // очистка введених даних
            }
            size = scanner.nextInt();
            if (size <= 0 || size > MAX_SIZE) {
                System.out.println("Розмір повинен бути додатнім числом та не більше " + MAX_SIZE + ".");
            }
        } while (size <= 0 || size > MAX_SIZE);
        return size;
    }

    private static int[][] createMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        System.out.println("Виберіть спосіб заповнення матриці:");
        System.out.println("1. Введення з клавіатури");
        System.out.println("2. Рандомне заповнення");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                matrix = inputMatrixFromKeyboard(rows, cols, scanner);
                break;
            case 2:
                matrix = generateRandomMatrix(rows, cols);
                break;
            default:
                System.out.println("Невірний вибір. Використано рандомне заповнення.");
                matrix = generateRandomMatrix(rows, cols);
        }

        return matrix;
    }

    private static int[][] inputMatrixFromKeyboard(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    private static double calculateGeometricAverage(int[][] matrix) {
        int product = 1;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                product *= value;
                count++;
            }
        }

        return Math.pow(product, 1.0 / count);
    }
}
