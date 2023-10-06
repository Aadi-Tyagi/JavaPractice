package Week1;

class Challenge2 {
    public static void main(String[] args) {

        int[] arr = {5, 7, 6, 9, 8, 1, -15, 2, 6};
        int length_of_array = arr.length;


        System.out.println("Array elements are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\nSum of array elements: " + calculate_sum(arr, length_of_array));

        System.out.println("\nAverage of array elements: " + find_avg(length_of_array,calculate_sum(arr, length_of_array)));
    }

    //Method for Calculating Sum
    static int calculate_sum(int[] arr, int length_of_array) {
        int sum = 0;
        for (int i = 0; i < length_of_array; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Method for printing average
    static float find_avg(int length_of_array, int sum) {

        float average;

        average = (float) sum /length_of_array;

        return average;

    }
}