import java.util.Scanner;

public class Main2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printDecreasing(n);
        
    }
    public static void printDecreasing(int n){
       for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

    }
}
