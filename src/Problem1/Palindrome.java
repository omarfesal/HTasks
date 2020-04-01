package Problem1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want: ");
        String value = sc.next();
        System.out.println(palindrome(value));

    }


    static boolean palindrome(String str){
        String str1 = str.substring(0,str.length()/2);
        String str2 = new StringBuilder(str.substring((int)Math.ceil(str.length()/2d))).reverse().toString();
        return str1.equals(str2);
    }
}
