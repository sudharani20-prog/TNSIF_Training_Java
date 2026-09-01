package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;

public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		char ch=sc.next().charAt(3);
		System.out.println("Fourth character is "+ch);

	}

}
