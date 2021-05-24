package bt2;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        LinkedList<Character>  max = new LinkedList<>();
        for (int i =0;i<str.length();i++){
            LinkedList<Character> newArr = new LinkedList<>();
            newArr.add(str.charAt(i));
            for(int j =0; j<str.length();j++){
                if(str.charAt(j) > newArr.getLast()){
                    newArr.add(str.charAt(j));
                }
            }
            if(newArr.size()>max.size()){
                max.clear();
                max.addAll(newArr);
            }
            newArr.clear();
        }
        for (Character ch : max){
            System.out.println(ch);
        }
    }

}
