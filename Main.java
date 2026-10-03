import java.util.Scanner;

public class Main {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Main ob=new Main();
        ob.sort(arr);   

        System.out.println("sorted array:");
        ob.printArray(arr);
    }
}
