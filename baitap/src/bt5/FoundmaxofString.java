package bt5;

import java.util.Scanner;

public class FoundmaxofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String input = sc.nextLine();
        String [] arr = input.split(" ");
        int index =0;
        int max = 0;
        for(int i =0;i<arr.length;i++){
            int len;
            len = arr[i].length();
            if(len>max){
                max = len;
                index = i;
            }
        }
        System.out.println("Từ " + arr[index] + " ở vị trí thứ " + index);
    }
    



}
