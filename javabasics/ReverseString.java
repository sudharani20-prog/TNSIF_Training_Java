package org.tnsif.acc.c2tc.javabasics;

public class ReverseString {
	public static void main(String[] args) {
		
        String str = "Java Program";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Orginal String: " + str);
        System.out.println("Reversed String: " + rev);
    }
}


