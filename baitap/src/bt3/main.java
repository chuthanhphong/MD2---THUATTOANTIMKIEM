package bt3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter your String");
       int arr[] = new int[255];
       for(int i=0;i<str.length();i++){
           int acsii = str.charAt(i);
           arr[acsii] +=1;
       }
       int max =0;
       char charater = (char) 255;
       for(int i =0;i<str.length();i++){
           if(arr[i]>max){
               max = arr[i];
               charater = (char) i;
           }
       }
        System.out.println("The most appearing letter is '" + charater + "' with a frequency of " + max + " times");
    }
}
