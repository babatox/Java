import java.util.Arrays;
import java.util.Scanner;

public class FindEvenNumbers {

    public int[] findEvenNumbers(int[] numbers) {
        int[] evenNumbers = new int[0];

        for (int number : numbers) {
            if (number % 2 == 0) {
                int[] largerArray = new int[evenNumbers.length + 1];
                System.arraycopy(evenNumbers, 0, largerArray, 0, evenNumbers.length);
                largerArray[evenNumbers.length] = number;
                evenNumbers = largerArray;
            }
        }

        return evenNumbers;
    }

    public int[] findOddNumbers(int[] numbers) {
        int[] oddNumbers = new int[0];

        for (int number : numbers) {
            if (number % 2 != 0) {
                int[] largerArray = new int[oddNumbers.length + 1];
                System.arraycopy(oddNumbers, 0, largerArray, 0, oddNumbers.length);
                largerArray[oddNumbers.length] = number;
                oddNumbers = largerArray;
            }
        }

        return oddNumbers;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of integers: ");
            int count = scanner.nextInt();

            int[] numbers = new int[count];
            System.out.println("Enter the integers:");
            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextInt();
            }

            FindEvenNumbers finder = new FindEvenNumbers();
            int[] evens = finder.findEvenNumbers(numbers);
            int[] odds = finder.findOddNumbers(numbers);

            System.out.println("Even numbers: " + Arrays.toString(evens));
            System.out.println("Odd numbers: " + Arrays.toString(odds));
        }
    }
}