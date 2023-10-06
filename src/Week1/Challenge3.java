package Week1;

public class Challenge3 {
    public static void main(String[] args) {

        int[] a = {5, 7, 6, 9, 8, 1, -15, 2, 6};
        int[] b = {10, 4, 5, 3, 1, 15, 8, 9, 12 };

        cArray(a,b);
    }

    static int maxElement(int[] a, int[] b, int i) {

        int maxValue;
        if(a[i] < b[i]){
            maxValue = b[i];
        }
        else{
            maxValue = a[i];
        }
        return maxValue;
    }

    static void cArray(int[] a, int[] b)    {

        float[] c = new float[a.length];

        for(int i=0;i<a.length;i++){
            c[i] = maxElement(a,b,i) + (float) a[i]/b[i];
        }

        System.out.print("\nArray C is: ");
        for (float v : c) {
            System.out.print(v + " ");
        }
    }
}