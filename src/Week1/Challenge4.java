package Week1;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int lengthOfString = calculateLength(str);
        System.out.println("Length of String is: "+ lengthOfString);
    }

    static int calculateLength(String str){
        int length = 0;

        for(char ch : str.toCharArray()){
            if( ch != '\0'){
                length++;
            }
            else
                break;
        }
        return length;
    }
}