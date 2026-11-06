import java.util.Scanner;


public class MaximumRowSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = input.nextInt();

        System.out.print("Enter number of columns:");
        int columns = input.nextInt();

        System.out.print("Enter the elements of the array:");
        int[][] array = new int[rows][columns];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();

            }
        }
        int maxSum = Integer.MIN_VALUE;
        int maxRow =0;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println("Maximum row sum is " + maxSum + " at row " + maxRow);
        System.out.println("The elements of the row with maximum sum are:");

        input.close();
        }
    }