package Week1;

import java.util.Scanner;

class Challenge1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //[5,7,6,9,8,1,-15,2,6]
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:\n ");

        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        print_array(arr,n);
    }

    static void print_array(int[] arr, int n){
        System.out.print("Array elements are: " );
        for(int i =0; i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void calculate_sum(int[] arr, int n){
        int sum =0;
        for(int i =0; i<n;i++){
            sum+=arr[i];
        }

        System.out.print("Sum of array elements: " + sum);
    }
}