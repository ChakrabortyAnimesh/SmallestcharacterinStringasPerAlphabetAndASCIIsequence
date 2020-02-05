package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int size=str.length();
       // System.out.println(size);
        char smallestChar=minimumCharValue (str,size);
        System.out.println(smallestChar);
    }

    private static char minimumCharValue(String str,int size) {
        /*
        * 	Letter	ASCII Code
        *    A            65
        *    Z            90
        *    a            97
        *    z            122

        * */
        char min='z';//Previous i put capital Z
        for(int i=0;i<size-1;i++)
        {
            if(str.charAt(i)<min)
                min=str.charAt(i);
        }
        return min;
    }
}
