import java.util.Scanner;

class BubbleSort{
    void bubblesort(int arr[]){
        int n=arr.length;
        for(int i = 0; i < n-1; i++){
            boolean swapped=false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort ob = new BubbleSort();
        ob.bubblesort(arr);
        System.out.println("Sorted array: ");
        ob.printArray(arr);
    }