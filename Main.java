import java.util.*;
public class Main {
    public static void Display(int[] arr,int index){
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        Display(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(" Array elements: ");
        Display(arr, 0);
        sc.close();
    }
    
}