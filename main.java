import java.util.Scanner;
    public class main{
        static void swap(int[]arr,int i,int j)
        {
            int temp=arr[j];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        static  int partition(int[] arr,int low,int high)
        {
            int pivot=arr [high];
            int i=low-1;
            for(int j=low;j<high;j++)
            {
                if(arr[j]<pivot)
                {
                    i++;
                    swap(arr,i,j);
                }
            }
            swap(arr,i+1,high);
            return (i+1);

        }
        static void quickSort(int[] arr,int low,int high)
        {
            if(low<high)
            {
                int pi=partition(arr,low,high);
                quickSort(arr,low,pi-1);
                quickSort(arr,pi+1,high);
            }
        }
        public static void printArray(int[]arr){
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
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
        main ob=new main();
            ob. quickSort(arr,0,arr.length-1);   

        System.out.println("sorted array:");
        ob.printArray(arr);
    }
}
           
        

        
    
    

